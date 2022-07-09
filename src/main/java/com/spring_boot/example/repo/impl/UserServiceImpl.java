package com.spring_boot.example.repo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_boot.example.entities.User;
import com.spring_boot.example.repo.UserRepository;
import com.spring_boot.example.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		User created = userRepository.save(user);
		return created;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		List<User> list = userRepository.findAll();
		return list;
	}

	@Override
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		User user = userRepository.findById(userId).get();
		return user;
	}

	@Override
	public User updateUser(int userId, User newUser) {
		// TODO Auto-generated method stub
		User user = userRepository.findById(userId).get();
		user.setName(newUser.getName());
		user.setEmail(newUser.getEmail());
		user.setPassword(newUser.getPassword());
		user.setAbout(newUser.getAbout());
		user.setCity(newUser.getCity());
		
		User updated = userRepository.save(user);
		return updated;
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		User user = userRepository.findById(userId).get();
		userRepository.delete(user);
	}

}
