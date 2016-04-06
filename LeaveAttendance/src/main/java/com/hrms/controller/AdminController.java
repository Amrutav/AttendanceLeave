package com.hrms.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hrms.domain.entity.AdminJsonResponse;
import com.hrms.domain.entity.User;
import com.hrms.domain.entity.UserJsonResponse;
import com.hrms.domain.services.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService adminService;
	@Autowired
	private MessageSource messageSource;
	static final Logger logger = Logger.getLogger(AdminController.class);
	private boolean flag = false;
	
	@RequestMapping(value="/getHRListForApproval")
	public @ResponseBody List<User> getHRListByAcctFlag(){
		List<User> getHRList = new ArrayList<User>();
		try {
			getHRList = adminService.getHRListByAcctFlag();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getHRList;
		
	}
	
	@RequestMapping(value="/approveHR")
	public @ResponseBody UserJsonResponse approveRejectHR(@RequestParam(value="user_id") int user_id){
		UserJsonResponse userJsonResponse  = new UserJsonResponse();
		try {
			flag = adminService.approveHR(user_id);
			if(flag){
				userJsonResponse.setStatus("SUCCESS");
			}
			else {
				userJsonResponse.setStatus("ERROR");
			}
			return userJsonResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userJsonResponse;
	}
	
	@RequestMapping(value="/removeHR")
	public @ResponseBody UserJsonResponse removeHR(@RequestParam(value="user_id") int user_id){
		UserJsonResponse userJsonResponse  = new UserJsonResponse();
		try {
			flag = adminService.removeHR(user_id);
			if(flag){
				userJsonResponse.setStatus("SUCCESS");
			}
			else {
				userJsonResponse.setStatus("ERROR");
			}
			return userJsonResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userJsonResponse;
	}
	
	@RequestMapping(value="/getEmployeeListForApproval")
	public @ResponseBody List<User> getEmployeeListByAcctFlag(){
		List<User> getHRList = new ArrayList<User>();
		try {
			getHRList = adminService.getEmployeeListByAcctFlag();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getHRList;
		
	}
	
	@RequestMapping(value="/approveEmployee")
	public @ResponseBody UserJsonResponse approveRejectEmployee(@RequestParam(value="user_id") int user_id){
		UserJsonResponse userJsonResponse  = new UserJsonResponse();
		try {
			flag = adminService.approveEmployee(user_id);
			if(flag){
				userJsonResponse.setStatus("SUCCESS");
			}
			else {
				userJsonResponse.setStatus("ERROR");
			}
			return userJsonResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userJsonResponse;
	}
	
	@RequestMapping(value="/removeEmployee")
	public @ResponseBody UserJsonResponse removeEmployee(@RequestParam(value="user_id") int user_id){
		UserJsonResponse userJsonResponse  = new UserJsonResponse();
		try {
			flag = adminService.removeEmployee(user_id);
			if(flag){
				userJsonResponse.setStatus("SUCCESS");
			}
			else {
				userJsonResponse.setStatus("ERROR");
			}
			return userJsonResponse;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userJsonResponse;
	}
}
