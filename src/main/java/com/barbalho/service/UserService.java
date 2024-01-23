package com.barbalho.service;

import com.barbalho.model.User;

public interface UserService {
	
	public User findUserById(Long userId) throws Exception;
	
}
