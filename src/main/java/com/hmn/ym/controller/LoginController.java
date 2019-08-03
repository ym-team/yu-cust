package com.hmn.ym.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController extends BaseController{
	
	/**
	 * 登录页面
	 */
	private static final String login_view = "login";
	
	/**
	 * 登录成功后进入主页面
	 */
	private static final String user_login_view = "user/userIndex";
	
	
	@RequestMapping("login")
	public String index(HttpServletRequest request, HttpServletResponse response) {
		logger.info("login");
		return login_view;
	}
	
	
	
	/**
	 * 进入个人主页
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping("userLogin.do")
	public String userIndex(HttpServletRequest request, HttpServletResponse response, Model model) {
		System.out.println("index");

		return user_login_view;
	}
	
	
	/**
	 * 底部菜单显示
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "foot.do")
	public String foot(HttpServletRequest request, HttpServletResponse response, Model model){
		Map<String, String> param = this.getParameters(request);
		if(param.containsKey("footId")){
			model.addAttribute("footId", param.get("footId"));
		}
		return "footer";
	}
	
	

}
