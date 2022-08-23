package com.bdmt.bdmt.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdmt.bdmt.model.Team;

@Repository
public class TeamDaoImpl implements TeamDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Team> list() {
		return sql.selectList("dao.list");
	}

	@Override
	public void add(Team team) {
		sql.insert("dao.insert", team);
	}

	@Override
	public Team teamItem(String TEAM_NO) {
		return sql.selectOne("dao.teamItem", TEAM_NO);
	}

	@Override
	public void update(Team team) {
		sql.update("dao.update", team);
	}

}
