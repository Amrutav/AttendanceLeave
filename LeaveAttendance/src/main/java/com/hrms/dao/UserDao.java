package com.hrms.dao;

import com.hrms.domain.entity.User;

public interface UserDao {

	public int getMaxId() throws Exception;

	public boolean newEmployeeRegister(User user) throws Exception;

	public User getAuthenticUser(User user) throws Exception;

}
