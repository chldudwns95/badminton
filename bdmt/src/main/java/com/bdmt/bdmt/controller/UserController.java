package com.bdmt.bdmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bdmt.bdmt.model.User;
import com.bdmt.bdmt.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	final String path = "user/";
	
	@Autowired
	UserService userSvc;
	
	@GetMapping("/signUp")
	String signUp() {
		return path + "signUp";
	}
	
	@PostMapping("/signUp")
	public String signUp(User user) {
		userSvc.signUp(user);
		
		return "redirect:/";
	}
	
	@GetMapping("/{USER_ID}/myEdit")
	public String myEdit(@PathVariable String USER_ID, Model model) {
		User user = userSvc.myEdit(USER_ID);
		
		model.addAttribute("myEdit", user);
		return path + "update";
	}
	
	@PostMapping("/{USER_ID}/myEdit")
	String myEdit(@PathVariable String USER_ID, User user) {
		user.setUSER_ID(USER_ID);

		userSvc.update(user);
		return "redirect:../list";
	}
}