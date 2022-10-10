package com.bdmt.bdmt.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdmt.bdmt.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public void signUp(User user) {
		sql.insert("User.signUp", user);
	}

	@Override
	public User item(String USER_ID) {
		return sql.selectOne("User.item", USER_ID);
	}

	@Override
	public void update(User user) {
		sql.update("User.myEdit", user);
	}

}
