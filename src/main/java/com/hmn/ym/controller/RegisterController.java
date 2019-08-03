package com.hmn.ym.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hmn.ym.utils.Const;

/**
 * 用户注册信息
 * @author oymw
 *
 */

@Controller
public class RegisterController extends BaseController{
	
	/**
	 * 注册第一步 进入填写密码页面
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	public static final String register = "register" ;
	
	
	/**
	 * 注册第2步
	 */
	public static final String register2 = "register2" ;
	

	/**
	 * 用户注册成功后跳转用户页面
	 */
	public static final String userIndex = "userindex";
	
	/**
	 * 注册协议
	 */
	public static final String protocol = "protocol";
	
	
	/**
	 * 注册页面第一步
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "toRegister.do")
	public String toRegister( HttpServletRequest request, Model model) {
		model.addAttribute("publickey", Const.DES_PUBLIC_ENCRYPT_KEY);
		model.addAttribute("u", request.getParameter("u"));
		return register;
	}
	
	
	/**
	 * 注册填写密码
	 * 注册第二步
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "toNext.do")
	public String toNext(HttpServletRequest request, HttpServletResponse response, Model model) {
		Map<String, String> param = this.getParameters(request);
		
		
		return register2;
	}
	
	
	/**
	 * 用户注册
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping("register.do")
	public String register(HttpServletRequest request, HttpServletResponse response, Model model) {
		Map<String, String> param = this.getParameters(request);
		
		
		return userIndex;
	}
	
	
	
	/**
	 * 注册协议
	 */
	@RequestMapping("getProtocol.do")
	public String getProtocol(HttpServletRequest request, HttpServletResponse response, Model model) {
		model.addAttribute("protocol","");
		return protocol;
	}

}
