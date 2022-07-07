package com.spring_boot.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring_boot.example.entities.User;
import com.spring_boot.example.helper.UserRowMapper;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//create new user from db
	public User createUser(User user) {
		
		String query = "insert into users(userId,name,email,password,about,city) value(?,?,?,?,?,?)";
		int update = jdbcTemplate.update(query, user.getUserId(),user.getName(),user.getEmail(),user.getPassword(),user.getAbout(),user.getCity());
		
		System.out.println(update +"rew created");
		return user;
	}

	//get all user from db
	public List<User> getAllUser()
	{
		String query ="select * from users";
		List<User> users = jdbcTemplate.query(query, new UserRowMapper());
		return users;
	}
	
	//get single user from db
	public User getUser(int userId)
	{
		String query ="select * from users where userId=?";
		User userfromdb = jdbcTemplate.queryForObject(query, new UserRowMapper(),userId);
		return userfromdb;
	}
	
	//update user from db
	public User updateUser(int userId, User newUser)
	{
		String query="update users set name=?,email=?,password=?,about=?,city=?  where userId=?";
		int update = jdbcTemplate.update(query,newUser.getName(),newUser.getEmail(),newUser.getPassword(),newUser.getAbout(),newUser.getCity(),userId);
		newUser.setUserId(userId);
		return newUser;
	}
	
	//delete user from db
	public void deleteUser(int userId)
	{
		String query = "delete from users where userId=?";
		int deleted = jdbcTemplate.update(query, userId);
		System.out.println(deleted + "row deleted");
	}
}






















