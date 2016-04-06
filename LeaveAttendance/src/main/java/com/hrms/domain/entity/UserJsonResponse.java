package com.hrms.domain.entity;

import java.util.Map;

public class UserJsonResponse {
	private String status;
	private Map<String, String> errorMap;
	private User user;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Map<String, String> getErrorMap() {
		return errorMap;
	}
	public void setErrorMap(Map<String, String> errorMap) {
		this.errorMap = errorMap;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
