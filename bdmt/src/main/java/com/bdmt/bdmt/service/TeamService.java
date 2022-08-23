package com.bdmt.bdmt.service;

import java.util.List;

import com.bdmt.bdmt.model.Team;

public interface TeamService {

	List<Team> list();

	void add(Team team);

	Team teamItem(String TEAM_NO);

	void update(Team team);

}
