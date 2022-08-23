package com.bdmt.bdmt.dao;

import java.util.List;

import com.bdmt.bdmt.model.Team;

public interface TeamDao {

	List<Team> list();

	void add(Team team);

	Team teamItem(String tEAM_NO);

	void update(Team team);

}
