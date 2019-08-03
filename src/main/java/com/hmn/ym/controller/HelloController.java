package com.hmn.ym.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hmn.ym.entity.SysSmsRecordEntity;
import com.hmn.ym.service.SysSmsRecordService;

@Controller 
public class HelloController {
	
	

	@Autowired
	private SysSmsRecordService sysSmsRecordSevice;
	
	
	@RequestMapping("/query")
	public String query(HttpServletRequest request, HttpServletResponse response) {
		String pkId = request.getParameter("pkId");
		SysSmsRecordEntity entity= sysSmsRecordSevice.selectSysSmsRecordById(pkId);
		System.out.println(entity);
		sysSmsRecordSevice.queryList();
		
		return "login";
	}
	
	@RequestMapping("/insert")
	public void insert(HttpServletRequest request, HttpServletResponse response) {
		SysSmsRecordEntity entity= new SysSmsRecordEntity();
		entity.setBatchId("12321");
		entity.setSendUserDeviceId("1");
		entity.setSendUserId(111);
		entity.setRecievePhoneNum("18028081307");
		entity.setCreateDate(new Date());
		entity.setSmsContent("boot 测试");
		entity.setBusiType("1");
		entity.setReturnCode("200");
		entity.setReturnMsg("boot 测试");
		entity.setOpTime(new Date());
		boolean bln = sysSmsRecordSevice.saveSysSmsRecordEntity(entity);
		System.out.println(bln+"=="+entity.getPkId());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
	/*
	 * @RequestMapping("/index") public String index() {
	 * 
	 * return "index"; }
	 * 
	 * @RequestMapping("/login") public String login() {
	 * 
	 * return "login"; }
	 * 
	 * @RequestMapping("/test1") public String test1() {
	 * 
	 * return "1"; }
	 */
    
    
    
    
    
}
