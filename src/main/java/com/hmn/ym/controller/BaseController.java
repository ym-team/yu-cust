package com.hmn.ym.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class BaseController {
	protected Logger logger = LoggerFactory
			.getLogger(this.getClass());
	public Map<String, String> getParameters(HttpServletRequest request) {
		if (request == null) {
			request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		}
		Map<?,?> req = request.getParameterMap();
		Map<String, String> p = new HashMap<String, String>();
		if ((req != null) && (!req.isEmpty())) {
			
			Collection keys = req.keySet();
			for (Iterator i = keys.iterator(); i.hasNext();) {
				String key = (String)i.next();
				Object value = req.get(key);
				Object v = null;
				if ((value.getClass().isArray())
						&& (((Object[]) value).length > 0)) {
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
			logger.info("params:==="+p);
			p.putAll(ReadCookieMap(request));
			return p;
		}
		return p;
	}
	
	/**
	 * 将cookie封装到Map里面
	 * @param request
	 * @return
	 */
	public static Map<String,String> ReadCookieMap(HttpServletRequest request){ 
	    Map<String,String> cookieMap = new HashMap<String,String>();
	    Cookie[] cookies = request.getCookies();
	    if(null!=cookies){
	        for(Cookie cookie : cookies){
	            cookieMap.put(cookie.getName(), cookie.getValue());
	        }
	    }
	    return cookieMap;
	}
}
