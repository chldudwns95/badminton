package com.bdmt.bdmt.service;

import java.util.List;

import com.bdmt.bdmt.model.Game;

public interface GameService {

	List<Game> list();

	void add(Game game);

	void update(Game game);

}
