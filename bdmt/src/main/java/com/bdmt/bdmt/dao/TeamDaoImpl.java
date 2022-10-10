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
		return sql.selectList("Team.teamList");
	}

	@Override
	public void add(Team team) {
		sql.insert("Team.addTeam", team);
	}

	@Override
	public void update(Team team) {
		sql.update("Team.updateTeam", team);
	}

	@Override
	public Team teamUpdate(String TEAM_ID) {
		return sql.selectOne("Team.teamItem", TEAM_ID);
	}
	
	@Override
	public void delete(String TEAM_ID) {
		sql.delete("Team.teamDelete", TEAM_ID);
	}

}
