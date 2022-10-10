package com.bdmt.bdmt.service;

import java.util.List;

import com.bdmt.bdmt.model.Team;

public interface TeamService {

	List<Team> list();
	void add(Team team);
	Team teamUpdate(String TEAM_ID);
	void update(Team team);
	void delete(String TEAM_ID);

}
