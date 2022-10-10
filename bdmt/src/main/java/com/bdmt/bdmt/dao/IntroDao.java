package com.bdmt.bdmt.dao;

import java.util.List;

import com.bdmt.bdmt.model.Board;

public interface IntroDao {

	List<Board> list();
	void add(Board board);
	Board introItem(String bOARD_ID);
	void update(Board board);
	void delete(String BOARD_ID);
}
