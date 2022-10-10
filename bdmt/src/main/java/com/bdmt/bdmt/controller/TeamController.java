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
	TeamService teamSvc;
	
	@GetMapping("/temaList")
		String list(Model model) {
		List<Team> teamList = teamSvc.list();
		model.addAttribute("teamList", teamList);
		
		return path + "teamList";
		}
	
	@GetMapping("/teamAdd")
		String add() {
		return path + "teamAdd";
	}
	
	@PostMapping("/teamAdd")
		String add(Team team) {
		teamSvc.add(team);
		
		return "redirect:teamList";
	}
	
	@GetMapping("/{TEAM_ID}/teamUpdate")
	String update(@PathVariable String TEAM_ID, Model model) {
		Team teamUpdate = teamSvc.teamUpdate(TEAM_ID);
		
		model.addAttribute("teamUpdateList", teamUpdate);
		return path + "teamUpdate";
	}

	@PostMapping("/{TEAM_ID}/teamUpdate")
	String update(@PathVariable String TEAM_ID, Team team) {
		team.setTEAM_ID(TEAM_ID);
		teamSvc.update(team);
		
		return "redirect:teamList";
	}
	
	@GetMapping("/{TEAM_ID}/delete")
	String delete(@PathVariable String TEAM_ID) {
		teamSvc.delete(TEAM_ID);
		
		return "redirct:../list";
	}
}
