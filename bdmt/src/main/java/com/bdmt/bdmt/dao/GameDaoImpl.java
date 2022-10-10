package com.bdmt.bdmt.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdmt.bdmt.model.Game;

@Repository
public class GameDaoImpl implements GameDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Game> list() {
		return sql.selectList("Game.gameList");
	}

	@Override
	public void add(Game game) {
		sql.insert("Game.addGame", game);
	}

	@Override
	public Game gameItem(String GAME_ID) {
		return sql.selectOne("GAME.gameItem", GAME_ID);
	}

	@Override
	public void update(Game game) {
		sql.update("Game.updateGame", game);
	}

	@Override
	public void delete(String GAME_ID) {
		sql.delete("Game.deleteGame", GAME_ID);
	}

}
