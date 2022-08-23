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
	GameService svc;
	
	@GetMapping("/gameList")
	String list(Model model) {
		List<Game> gameList = svc.list();
		
		model.addAttribute("list", gameList);
		
		return path + "gameList";
	}

	@GetMapping("/{GAME_ID}/add") 
	String add(Game game, @PathVariable String GAME_ID) {
		svc.add(game);
		
		return "redirect:/";
	}
	
	@GetMapping("/{GAME_ID}/update")
	String update(@PathVariable String GAME_ID) {
				
		return "redirect:/";
	}
	
	@PostMapping("/{GAME_ID}/update")
	String update(@PathVariable String GAME_ID, Game game) {
		game.setGAME_ID(GAME_ID);
		
		svc.update(game);
		
		return "redirect:list";
	}
}
