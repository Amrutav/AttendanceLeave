package com.hrms.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hrms.domain.entity.User;
import com.hrms.domain.entity.UserJsonResponse;
import com.hrms.domain.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	private MessageSource messageSource;
	static final Logger logger = Logger.getLogger(UserController.class);
	//private boolean flag = false;
	
	@RequestMapping(value = "/employeeRegister", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody UserJsonResponse employeeRegister(@Valid @RequestBody User user,BindingResult bindingResult){
		UserJsonResponse userJsonResponse  = new UserJsonResponse();
		if(bindingResult.hasErrors()){
			Map<String, String> error = new HashMap<String, String>();
			List<FieldError> fieldErrors = bindingResult.getFieldErrors();
			for(FieldError fieldError : fieldErrors){
				String[] resolveMessageCodes = bindingResult.resolveMessageCodes(fieldError.getCode());
				String string = resolveMessageCodes[0];
				logger.debug("ResolveMessageCodes : "+string);
				String messages = messageSource.getMessage(string+"."+fieldError.getField(), new Object[]{fieldError.getRejectedValue()}, null);
				logger.debug("Messages : "+messages);
				error.put(fieldError.getField(), messages);
			}
			userJsonResponse.setErrorMap(error);
			userJsonResponse.setUser(user);
			userJsonResponse.setStatus("ERROR");
			return userJsonResponse;
		}else {
			try {
				//User user = new User();
				int getId =  userService.getMaxId();
				getId = getId+1;
				String prefix = "Q";
				String suffix = String.format("%04d", getId);               
				user.setEmployee_code(prefix.concat(suffix));
				System.out.println(prefix.concat(suffix));
				user.setUser_account_create_date(new Date());
				System.out.println("OK");
				String imagedata = user.getProfile_pic();
				byte[] decoded = org.apache.commons.codec.binary.Base64.decodeBase64(imagedata .getBytes());
				user.setUser_profile_pic(decoded);
				userService.newEmployeeRegister(user);
				System.out.println(user);
				userJsonResponse.setStatus("SUCCESS");
				return userJsonResponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				logger.error("Error occours in : ",e);
				userJsonResponse.setStatus(e.toString());
			}
		}
		return userJsonResponse;
	}
	
	@RequestMapping(value="/login")
	public @ResponseBody UserJsonResponse login(@Valid @RequestBody User user,BindingResult bindingResult){
		UserJsonResponse userJsonResponse = new UserJsonResponse();
		if(bindingResult.hasErrors()){
			Map<String, String> error = new HashMap<String, String>();
			List<FieldError> fieldErrors = bindingResult.getFieldErrors();
			for(FieldError fieldError : fieldErrors){
				String[] resolveMessageCodes = bindingResult.resolveMessageCodes(fieldError.getCode());
				String string = resolveMessageCodes[0];
				logger.debug("ResolveMessageCodes : "+string);
				String messages = messageSource.getMessage(string+"."+fieldError.getField(), new Object[]{fieldError.getRejectedValue()}, null);
				logger.debug("Messages : "+messages);
				error.put(fieldError.getField(), messages);
			}
			userJsonResponse.setErrorMap(error);
			userJsonResponse.setUser(user);
			userJsonResponse.setStatus("ERROR");
			return userJsonResponse;
		}else{
			try {
				User validUser = userService.getAuthenticateUser(user);
				if(validUser.getUser_id() > 0){
					userJsonResponse.setStatus("SUCCESS");
					userJsonResponse.setUser(validUser);
				}else{
					userJsonResponse.setStatus("FAILED");
				}
				return userJsonResponse;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return userJsonResponse;
	}
	
}
