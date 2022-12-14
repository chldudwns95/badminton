package com.bdmt.bdmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdmt.bdmt.dao.GameDao;
import com.bdmt.bdmt.model.Game;

@Service
public class GameServiceImpl implements GameService {

	@Autowired
	GameDao dao;
	
	@Override
	public List<Game> list() {
		return dao.list();
	}

	@Override
	public void add(Game game) {
		dao.add(game);
	}

	@Override
	public Game gameitem(String GAME_ID) {
		return dao.gameItem(GAME_ID);
	}

	@Override
	public void update(Game game) {
		dao.update(game);
	}

	@Override
	public void delete(String GAME_ID) {
		dao.delete(GAME_ID);
	}

}
