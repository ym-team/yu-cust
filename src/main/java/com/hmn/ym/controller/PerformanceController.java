package com.hmn.ym.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("performance/")
public class PerformanceController extends BaseController {

	/**
	 * performanceView
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@GetMapping("performanceView.do")
	public String performanceView(HttpServletRequest request, HttpServletResponse response) {

		return "/salesman/performance";
	}

	@GetMapping("teamView.do")
	public String teamView(HttpServletRequest request, HttpServletResponse response) {

		return "/salesman/team";
	}

	@GetMapping("myCustView.do")
	public String myCustView(HttpServletRequest request, HttpServletResponse response) {

		return "/salesman/mycust";
	}
	
	@GetMapping("myCustomerView.do")
	public String myCustomerView(HttpServletRequest request, HttpServletResponse response) {

		return "/salesman/mycustomer";
	}
	
	
	@RequestMapping(value = "salesmanindex.do")
	public String salesmanindex(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "/salesman/salesmanindex";
	}
}
