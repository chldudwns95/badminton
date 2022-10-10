package com.bdmt.bdmt.model;

import java.util.Date;

public class Board {
	String BOARD_ID;
	String USER_ID;
	String BOARD_CATE;
	String BOARD_TITLE;
	String BOARD_CONTENT;
	Date BOARD_DATE;
	
	public String getBOARD_ID() {
		return BOARD_ID;
	}
	public void setBOARD_ID(String BOARD_ID) {
		BOARD_ID = BOARD_ID;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String USER_ID) {
		USER_ID = USER_ID;
	}
	public String getBOARD_CATE() {
		return BOARD_CATE;
	}
	public void setBOARD_CATE(String BOARD_CATE) {
		BOARD_CATE = BOARD_CATE;
	}
	public String getBOARD_TITLE() {
		return BOARD_TITLE;
	}
	public void setBOARD_TITLE(String BOARD_TITLE) {
		BOARD_TITLE = BOARD_TITLE;
	}
	public String getBOARD_CONTENT() {
		return BOARD_CONTENT;
	}
	public void setBOARD_CONTENT(String BOARD_CONTENT) {
		BOARD_CONTENT = BOARD_CONTENT;
	}
	public Date getBOARD_DATE() {
		return BOARD_DATE;
	}
	public void setBOARD_DATE(Date BOARD_DATE) {
		BOARD_DATE = BOARD_DATE;
	}
}
