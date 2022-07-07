package com.spring_boot.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_boot.example.entities.User;
import com.spring_boot.example.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;

	//creating user
	
@PostMapping("/")
public User createUser( @RequestBody  User user) {
	
	User createdUser = userService.createUser(user);
	System.out.println("user create");
	return createdUser;
}

//get All user
	@GetMapping("/")
	public List<User> getAllUser(){
		List<User> lists = userService.getAllUser();
		return lists;
	}
	
	//get single user
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable  int userId) {
		
		User user = userService.getUser(userId);
		return user;
	}
	
	//update user
	
	@PutMapping("/{userId}")
	public User updateUser(@PathVariable int userId, @RequestBody User newUser) {
		User updatedUser = userService.updateUser(userId, newUser);
		return updatedUser;
	}
	
	//delete user
	
	@DeleteMapping("/{userId}")
	public String deleteUser(@PathVariable int userId) {
		userService.deleteUser(userId);
		return "user is delete successfully !!!";
	}
	
	
}
