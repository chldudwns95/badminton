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
	public void add(User user) {
		dao.add(user);
	}

	@Override
	public void update(User user) {
		dao.update(user);
	}

}
