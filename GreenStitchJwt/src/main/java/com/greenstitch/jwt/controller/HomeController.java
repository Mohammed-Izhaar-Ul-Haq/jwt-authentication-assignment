package com.greenstitch.jwt.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenstitch.jwt.entity.User;
import com.greenstitch.jwt.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private UserService userService;

	//http://localhost:8080/home/users
	@GetMapping("/users")
	public List<User> getUser() {
		System.out.println("getting users");
	return userService.getUsers();
	}
	//http://localhost:8080/home/current-user
	@GetMapping("/current-user")
	public String getLoggedinUser(Principal principal) {
		return principal.getName();
	}
	
}
