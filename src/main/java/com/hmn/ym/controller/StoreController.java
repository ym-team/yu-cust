package com.hmn.ym.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("store/")
public class StoreController extends BaseController{

	public static final String storeenterview = "/store/enterview";
	
	/**
	 * 业务员邀请店门入驻
	 * 二维码方式
	 */
	@RequestMapping(value = "StoreEnterView.do")
	public String StoreEnterView(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("store");
		
		return storeenterview;
	}
	
	
}
