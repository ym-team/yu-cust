package com.hmn.ym.controller;

import com.google.common.collect.Maps;
import com.hmn.ym.servlet.JcaptchaServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaseController {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    private static final Pattern regex = Pattern.compile("1[3|5|7|8|][0-9]{9}");

    public Map<String, String> getParameters(HttpServletRequest request) {
        if (request == null) {
            request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        }
        Map<?, ?> req = request.getParameterMap();
        Map<String, String> p = Maps.newHashMap();
        if ((req != null) && (!req.isEmpty())) {
            Collection keys = req.keySet();
            for (Iterator i = keys.iterator(); i.hasNext(); ) {
                String key = (String) i.next();
                Object value = req.get(key);
                Object v = null;
                if ((value.getClass().isArray()) && (((Object[]) value).length > 0)) {
                    v = ((Object[]) value)[0];
                } else {
                    v = value;
                }
                if ((v != null) && ((v instanceof String))) {
                    String s = (String) v;
                    if (s.length() > 0) {
                        p.put(key, s);
                    }
                }
            }
            //读取cookie
            logger.info("params:===" + p);
            p.putAll(this.readCookieMap(request));
            return p;
        }
        return p;
    }

    /**
     * 将cookie封装到Map里面
     *
     * @param request
     * @return
     */
    public static Map<String, String> readCookieMap(HttpServletRequest request) {
        Map<String, String> cookieMap = Maps.newHashMap();
        Cookie[] cookies = request.getCookies();
        if (null != cookies) {
            for (Cookie cookie : cookies) {
                cookieMap.put(cookie.getName(), cookie.getValue());
            }
        }
        return cookieMap;
    }

    public boolean validateCaptcha(HttpServletRequest request, String code) {
        boolean bln = false;
        code = code.toUpperCase();
        String cd = request.getSession().getAttribute(JcaptchaServlet.CAPTCHA_SESSION) + "";
        if (cd.equals(code)) {
            bln = true;
        }
        return bln;
    }

    /**
     * 检查phone，返回true表示是，反之为否
     *
     * @return
     */
    public boolean isPhone(String phone) {
        phone = this.isNull(phone);
        Matcher matcher = regex.matcher(phone);
        return matcher.matches();
    }

    /**
     * 如果str为null，返回“”,否则返回str
     *
     * @param str
     * @return
     */
    public String isNull(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }
}
