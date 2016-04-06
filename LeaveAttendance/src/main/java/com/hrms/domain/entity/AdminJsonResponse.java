package com.hrms.domain.entity;

import java.util.Map;

public class AdminJsonResponse {
		
	private String status;
	private Map<String, String> errorMap;
	private Admin admin;
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
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
}
