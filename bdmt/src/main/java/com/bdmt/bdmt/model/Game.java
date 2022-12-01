package com.bdmt.bdmt.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Game {

	String GAME_ID;
	String GAME_NM;
	String GAME_OPEN;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date GAME_START_DT;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date GAME_END_DT;
	
	public String getGAME_ID() {
		return GAME_ID;
	}
	public void setGAME_ID(String gAME_ID) {
		GAME_ID = gAME_ID;
	}
	public String getGAME_NM() {
		return GAME_NM;
	}
	public void setGAME_NM(String gAME_NM) {
		GAME_NM = gAME_NM;
	}
	public String getGAME_OPEN() {
		return GAME_OPEN;
	}
	public void setGAME_OPEN(String gAME_OPEN) {
		GAME_OPEN = gAME_OPEN;
	}
	public Date getGAME_START_DT() {
		return GAME_START_DT;
	}
	public void setGAME_START_DT(Date gAME_START_DT) {
		GAME_START_DT = gAME_START_DT;
	}
	public Date getGAME_END_DT() {
		return GAME_END_DT;
	}
	public void setGAME_END_DT(Date gAME_END_DT) {
		GAME_END_DT = gAME_END_DT;
	}
	
	
}
