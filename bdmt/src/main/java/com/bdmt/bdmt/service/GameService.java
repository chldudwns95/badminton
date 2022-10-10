package com.bdmt.bdmt.service;

import java.util.List;

import com.bdmt.bdmt.model.Game;

public interface GameService {

	List<Game> list();
	void add(Game game);
	Game gameitem(String GAME_ID);
	void update(Game game);
	void delete(String GAME_ID);


}
