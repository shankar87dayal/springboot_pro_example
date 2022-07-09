//package com.spring_boot.example.serviceimpl;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import org.springframework.stereotype.Service;
//
//import com.spring_boot.example.entities.User;
//import com.spring_boot.example.service.UserService;
//
//@Service
//public class UserServiceImpl implements UserService{
//
//	List<User> list = new ArrayList<>();
//	
//	
//	//create
//	
//	@Override
//	public User createUser(User user) {
//		// TODO Auto-generated method stub
//		System.out.println(user.getName());
//		list.add(user);
//		return user;
//	}
//
//	//get All
//	
//	@Override
//	public List<User> getAllUser() {
//		// TODO Auto-generated method stub
//		
//		return list;
//	}
//
//	//get single
//	
//	@Override
//	public User getUser(int userId) {
//		// TODO Auto-generated method stub
//		User user = list.stream().filter(u->u.getUserId() == userId).findFirst().get();
//		System.out.println(user.getName());
//		return user;
//	}
//
//	//update
//	
//	@Override
//	public User updateUser(int userId, User newUser) {
//		// TODO Auto-generated method stub
//		List<User> updatedUser = list.stream().map(u->
//		{
//			if(u.getUserId() == userId)
//			{
//				u.setName(newUser.getName());
//				u.setEmail(newUser.getEmail());
//				u.setPassword(newUser.getPassword());
//				u.setCity(newUser.getCity());
//				u.setAbout(newUser.getAbout());
//				
//				return u;
//			}else {
//				return u;
//			}
//		}).collect(Collectors.toList());
//		list=updatedUser;
//		newUser.setUserId(userId);
//		return newUser;
//	}
//
//	//delete
//	
//	@Override
//	public void deleteUser(int userId) {
//		// TODO Auto-generated method stub
//		
//		List<User> newlist = list.stream().filter(u->u.getUserId() != userId).collect(Collectors.toList());
//		list = newlist;
//	}
//
//}
