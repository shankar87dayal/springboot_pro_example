//package com.spring_boot.example.serviceimpl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Service;
//
//import com.spring_boot.example.dao.UserDao;
//import com.spring_boot.example.entities.User;
//import com.spring_boot.example.service.UserService;
//
//@Service
//@Primary
//public class UserDaoServiceImpl implements UserService{
//
//	@Autowired
//	private UserDao userDao;
//	
//	@Override
//	public User createUser(User user) {
//		// TODO Auto-generated method stub
//		return userDao.createUser(user);
//	}
//
//	@Override
//	public List<User> getAllUser() {
//		// TODO Auto-generated method stub
//		return userDao.getAllUser();
//	}
//
//	@Override
//	public User getUser(int userId) {
//		// TODO Auto-generated method stub
//		return userDao.getUser(userId);
//	}
//
//	@Override
//	public User updateUser(int userId, User newUser) {
//		// TODO Auto-generated method stub
//		return userDao.updateUser(userId, newUser);
//	}
//
//	@Override
//	public void deleteUser(int userId) {
//		// TODO Auto-generated method stub
//		userDao.deleteUser(userId);
//		
//	}
//
//}
