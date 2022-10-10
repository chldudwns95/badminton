package com.bdmt.bdmt.service;

import com.bdmt.bdmt.model.User;

public interface UserService {

	void signUp(User user);
	User myEdit(String USER_ID);
	void update(User user);
}
