package com.bdmt.bdmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bdmt.bdmt.model.Team;
import com.bdmt.bdmt.service.TeamService;

@Controller
@RequestMapping("/team")
public class TeamController {

	final String path = "team/";
	
	@Autowired
	TeamService svc;
	
	@GetMapping("/teamList")
	String list(Model model) {
		List<Team> TeamList = svc.list();
		
		model.addAttribute("list", TeamList);
		
		return path + "teamList";
	}
	
	@GetMapping("/add")
	String add() {

		return path + "add";
	}
	
	@PostMapping("/{TEAM_NO}/add")
	String add(Team team, @PathVariable String TEAM_NO) {
		svc.add(team);
		return "redirect:list";
	}
	
	@GetMapping("/{TEAM_NO}/update")
	String update(@PathVariable String TEAM_NO, Model model) {
		Team team = svc.teamItem(TEAM_NO);
		
		model.addAttribute("teamItem", team);
		
		return path + "update";
	}
	
	@PostMapping("/{TEAM_NO}/update")
	String update(@PathVariable String TEAM_NO, Team team) {
		team.setTEAM_NO(TEAM_NO);
		svc.update(team);
		
		return "redirect:../list";
	}
}
