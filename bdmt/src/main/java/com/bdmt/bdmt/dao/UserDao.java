package com.bdmt.bdmt.dao;

import com.bdmt.bdmt.model.User;

public interface UserDao {

	void signUp(User user);

	User item(String uSER_ID);

	void update(User user);

}
