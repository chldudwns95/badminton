package com.bdmt.bdmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bdmt.bdmt.model.Board;
import com.bdmt.bdmt.service.IntroService;

@Controller
@RequestMapping("/intro")
public class IntroController {
	
	final String path = "intro/";
	
	@Autowired
	IntroService introSvc;
	
	@GetMapping("/introList")
	String instoList(Model model) {
		List<Board> introList = introSvc.introList();
		model.addAttribute("list", introList);
		
		return path + "introList";
	}

	@GetMapping("/introAdd")
	String add() {
		return path + "introAdd";
	}
	
	@PostMapping("/introAdd")
	String add(Board board) {
		introSvc.add(board);
		
		return "redirect:introList";
	}
	
	@GetMapping("/{BOARD_ID}/introUpdate")
	String update(@PathVariable String BOARD_ID, Model model) {
		 Board introItem = introSvc.introItem(BOARD_ID);
		 model.addAttribute("boardItem", introItem);
		 
		 return path + "introUpdate";
	}
	
	@PostMapping("/{BOARD_ID}/introUpdate")
	String update(@PathVariable String BOARD_ID, Board board) {
		board.setBOARD_ID(BOARD_ID);
		introSvc.update(board);
		
		return "redirect:../introList";
	}

	@GetMapping("/{BOARD_ID}/delete")
	String delete(@PathVariable String BOARD_ID) {
		introSvc.delete(BOARD_ID);
		
		return "redirect:../introList";
	}
}	