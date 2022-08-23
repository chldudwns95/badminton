package com.bdmt.bdmt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	UserService svc;
	
	
	@GetMapping("/add")
	String add(User user) {
		svc.add(user);
		
		return "redirect:/";
	}
	
	@GetMapping("/{USER_ID}/update")
	String update(@PathVariable String USER_ID) {
		
		return path + "update";
	}
	
	@PostMapping("/{USER_ID}/update")
	String update(@PathVariable String USER_ID, User user) {
		user.setUSER_ID(USER_ID);
		
		svc.update(user);
		
		return "redirect:list";
	}
}
