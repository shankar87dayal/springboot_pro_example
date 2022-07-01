package com.spring_boot.example.service;

import java.util.List;

import com.spring_boot.example.entities.User;

public interface UserService {

	public User createUser(User user);
	
	public List<User> getAllUser();
	
	public User getUser(int userId);
	
	public User updateUser(int userId, User newUser);
	
	public void deleteUser(int userId);
}
