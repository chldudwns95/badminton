package com.bdmt.bdmt.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bdmt.bdmt.model.Board;

@Repository
public class IntroDaoImpl implements IntroDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<Board> list() {
		return sql.selectList("Intro.introList");
	}

	@Override
	public void add(Board board) {
		sql.insert("Intro.addIntro", board);
	}

	@Override
	public Board introItem(String BOARD_ID) {
		return sql.selectOne("Intro.introItem", BOARD_ID);
	}

	@Override
	public void update(Board board) {
		sql.update("Intro.updateIntro", board);
	}

	@Override
	public void delete(String BOARD_ID) {
		sql.delete("Intro.deleteIntro", BOARD_ID);
	}
}
