package com.hmn.ym.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hmn.ym.utils.SpringUtils;
import com.hmn.ym.utils.qrcode.QRCodeUtil;
import com.hmn.ym.utils.upload.UploadUtils;

@Controller
@RequestMapping("user/")
public class UserController extends BaseController{
	
	/**
	 * 用户信息
	 */
	private static final String user_info = "user/userInfo";
	
	private static final String user_code = "user/usercode";
	
	
	@RequestMapping(value = "userInfoView.do")
	public String userInfoView(HttpServletRequest request, Model model) {
		
		
		return user_info;
	}
	
	
	@RequestMapping(value = "userCode.do")
	public String userCode(HttpServletRequest request, Model model) {
		
		
		return user_code;
	}
	
	/**
	 * 根据用户邀请链接生成二维码
	 * 
	 * @param request
	 * @param response
	 * @param model
	 */
	@RequestMapping("createImg.do")
	public void createImg(HttpServletRequest request, HttpServletResponse response, Model model) {
		 
		String code = "500";
		String msg = "";

		String path = request.getContextPath();
		String uid = "123";
		// 二维码扫描跳转链接
		String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
				+ path + "/web/toRegister.do?u="+uid ;
		try {
			String fileSufix = UploadUtils.getRelatedPath();
			String str = "/" +uid+ "-" + UUID.randomUUID().toString() + ".png";
			// 二维码文件路径
			String twoCodeUrl = UploadUtils.getRealPath() + str.replace("/", "\\");
			// 生成一个二维码
			QRCodeUtil.encode(basePath, null, twoCodeUrl, true);
			// 把邀请用户二维码存入数据库
			msg = "fileSufix + str";
				msg = fileSufix + str;
			code = "200";
		} catch (Exception e) {
			logger.error("createImg error ", e);
		}
	
		SpringUtils.renderJsonResult(response, code, msg);
	}

}
