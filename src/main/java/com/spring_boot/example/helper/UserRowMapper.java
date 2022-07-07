package com.spring_boot.example.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring_boot.example.entities.User;

public class UserRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		User u = new User();
		u.setUserId(rs.getInt("userId"));
		u.setName(rs.getString("name"));
		u.setEmail(rs.getString("email"));
		u.setPassword(rs.getString("password"));
		u.setAbout(rs.getString("about"));
		u.setCity(rs.getString("city"));
		
		return u;
	}

}
