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
import com.spring_boot.example.serviceimpl.UserServiceImpl;

@RestController
@RequestMapping("user_api")
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;

	//creating user
	
@PostMapping("/")
public User createUser( @RequestBody  User user) {
	
	User createdUser = userServiceImpl.createUser(user);
	System.out.println("user create");
	return createdUser;
}

//get All user
	@GetMapping("/list")
	public List<User> getAllUser(){
		List<User> lists = userServiceImpl.getAllUser();
		return lists;
	}
	
	//get single user
	
	@GetMapping("/get-user/{userId}")
	public User getUser(@PathVariable  int userId) {
		
		User user = userServiceImpl.getUser(userId);
		return user;
	}
	
	//update user
	
	@PutMapping("/update/{userId}")
	public User updateUser(@PathVariable int userId, @RequestBody User newUser) {
		User updatedUser = userServiceImpl.updateUser(userId, newUser);
		return updatedUser;
	}
	
	//delete user
	
	@DeleteMapping("/delete/{userId}")
	public String deleteUser(@PathVariable int userId) {
		userServiceImpl.deleteUser(userId);
		return "user is delete successfully !!!";
	}
	
	
}
