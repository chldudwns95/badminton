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
	public void add(User user) {
		sql.insert("user.add", user);
	}

	@Override
	public void update(User user) {
		sql.update("user.update", user);
	}

}
