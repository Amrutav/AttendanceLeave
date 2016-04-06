package com.hrms.domain.services;

import com.hrms.domain.entity.User;

public interface UserService {

	public boolean newEmployeeRegister(User user) throws Exception;

	public int getMaxId() throws Exception;

	public User getAuthenticateUser(User user) throws Exception;

}
