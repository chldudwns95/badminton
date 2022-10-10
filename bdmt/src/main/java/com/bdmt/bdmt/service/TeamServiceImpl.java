package com.bdmt.bdmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdmt.bdmt.dao.TeamDao;
import com.bdmt.bdmt.model.Team;

@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	TeamDao dao;
	
	@Override
	public List<Team> list() {
		return dao.list();
	}

	@Override
	public void add(Team team) {
		dao.add(team);
	}

	@Override
	public Team teamUpdate(String TEAM_ID) {
		return dao.teamUpdate(TEAM_ID);
	}

	@Override
	public void update(Team team) {
		dao.update(team);
	}

	@Override
	public void delete(String TEAM_ID) {
		dao.delete(TEAM_ID);
	}
}
