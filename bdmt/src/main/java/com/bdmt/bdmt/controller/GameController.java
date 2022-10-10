package com.bdmt.bdmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bdmt.bdmt.model.Game;
import com.bdmt.bdmt.service.GameService;

@Controller
@RequestMapping("/game")
public class GameController {
	final String path = "game/";
	
	@Autowired
	GameService gameSvc;
	
	@GetMapping("/gameList")
	String list(Model model) {
		List<Game> gameList = gameSvc.list();
		model.addAttribute("gameList", gameList);
		
		return path + "gameList"; 
	}
	
	@GetMapping("/gameAdd")
	String add() {
		return path + "gameAdd";
	}
	
	@PostMapping("/{GAME_ID}/gameAdd")
	String add(Game game) {
		gameSvc.add(game);
		
		return path + "redirect:gameAdd";
	}
	
	@GetMapping("/{GAME_ID}/gameUpdate")
	String update(@PathVariable String GAME_ID, Model model) {
		Game gameitem = gameSvc.gameitem(GAME_ID);
		model.addAttribute("gameUpdateList", gameitem);
		
		return path + "gameUpdate";
	}
	
	@PostMapping("/{GAME_ID}/gameUpdate")
	String update(@PathVariable String GAME_ID, Game game) {
		game.setGAME_ID(GAME_ID);
		gameSvc.update(game);
		
		return "redirect:gameList";
	}
	
	@GetMapping("/{GAME_ID}/delete") 
	String delete(@PathVariable String GAME_ID) {
		gameSvc.delete(GAME_ID);
		
		return "redirect:gameList";
	}
}
