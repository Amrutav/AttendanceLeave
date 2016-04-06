package com.hrms.dao;

import java.util.List;

import com.hrms.domain.entity.User;

public interface AdminDao {

	public List<User> getHRListByAcctFlag()throws Exception;

	public boolean approveHR(int user_id) throws Exception;

	public boolean removeHR(int user_id) throws Exception;

	public List<User> getEmployeeListByAcctFlag() throws Exception;

	public boolean approveEmployee(int user_id) throws Exception;

	public boolean removeEmployee(int user_id) throws Exception;

}
