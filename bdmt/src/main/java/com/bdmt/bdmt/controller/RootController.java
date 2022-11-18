package com.bdmt.bdmt.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bdmt.bdmt.model.User;
import com.bdmt.bdmt.service.UserService;

@Controller
@RequestMapping("/")
public class RootController {
	
	@Autowired
	UserService userSvc;
	
	@RequestMapping("/")
	String index() {
		return "index";  
	}

	@GetMapping("/login")
	String login() {
		return "login";
	}
	
	@PostMapping("/login")
	String login(User user, Model model, HttpSession session) {
		User loginUser = userSvc.login(user);
		
		if(loginUser != null) {
			session.setAttribute("user", loginUser);
			return "redirect:/";
		}
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	String logout(HttpSession session) {
		session.invalidate();
		
		return "redirect:/";
	}
}