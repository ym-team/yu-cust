package com.hmn.ym.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("customer/")
public class CustomerController extends BaseController {

    @GetMapping("toAdd.do")
    public String toAdd() {
        return "/customer/customerView";
    }
    
    
	@RequestMapping(value = "list.do")
	public String storeRegister(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "/customer/mycustList";
	}
	
	
	@RequestMapping(value = "detail.do")
	public String detail(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "/store/customDetail";
	}
}
