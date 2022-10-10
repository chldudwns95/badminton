package com.bdmt.bdmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdmt.bdmt.dao.IntroDao;
import com.bdmt.bdmt.model.Board;

@Service
public class introServiceImpl implements IntroService {

	@Autowired
	IntroDao dao;
	
	@Override
	public List<Board> introList() {
		return dao.list();
	}

	@Override
	public void add(Board board) {
		dao.add(board);
	}

	@Override
	public Board introItem(String BOARD_ID) {
		return dao.introItem(BOARD_ID);
	}

	@Override
	public void update(Board board) {
		dao.update(board);
	}

	@Override
	public void delete(String BOARD_ID) {
		dao.delete(BOARD_ID);
	}

}
