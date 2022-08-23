package com.bdmt.bdmt.dao;

import java.util.List;

import com.bdmt.bdmt.model.Game;

public interface GameDao {

	List<Game> list();

	void add(Game game);

	void update(Game game);


}
