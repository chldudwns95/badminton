package com.bdmt.bdmt.dao;

import java.util.List;
import com.bdmt.bdmt.model.Game;

public interface GameDao {

	List<Game> list();
	void add(Game game);
	Game gameItem(String gAME_ID);
	void update(Game game);
	void delete(String gAME_ID);
}
