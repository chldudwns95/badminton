package com.bdmt.bdmt.service;

import java.util.List;

import com.bdmt.bdmt.model.Board;

public interface IntroService {

	List<Board> introList();
	void add(Board board);
	Board introItem(String BOARD_ID);
	void update(Board board);
	void delete(String bOARD_ID);

}
