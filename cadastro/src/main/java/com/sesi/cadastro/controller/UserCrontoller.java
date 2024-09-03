package com.sesi.cadastro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesi.cadastro.model.User;

@RestController
@RequestMapping("/users")
public class UserCrontoller {
	private List<User> users = new ArrayList<>();
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		users.add(user);
		return user;
	}
	
	
	public List<User> getAllUsers(){
		return users;
	}
	
}