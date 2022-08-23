package com.bdmt.bdmt.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdmt.bdmt.model.Game;

@Repository
public class gameDaoImpl implements GameDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Game> list() {
		return sql.selectList("game.list");
	}

	@Override
	public void add(Game game) {
		sql.insert("game.add", game);
	}

	@Override
	public void update(Game game) {
		sql.insert("game.update", game);
	}
}
