package com.bdmt.bdmt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdmt.bdmt.dao.UserDao;
import com.bdmt.bdmt.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;
	
	@Override
	public void signUp(User user) {
		dao.signUp(user);
	}

	@Override
	public User myEdit(String USER_ID) {
		return dao.item(USER_ID);
	}

	@Override
	public void update(User user) {
		dao.update(user);
	}

	@Override
	public User login(User user) {
		User loginUser = dao.login(user);
		if(user != null) {
			return user;
		}
		return null;
	}
}
