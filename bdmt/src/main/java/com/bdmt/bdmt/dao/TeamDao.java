package com.bdmt.bdmt.dao;

import java.util.List;

import com.bdmt.bdmt.model.Team;

public interface TeamDao {

	List<Team> list();
	void add(Team team);
	void update(Team team);
	Team teamUpdate(String TEAM_ID);
	void delete(String TEAM_ID);
}
