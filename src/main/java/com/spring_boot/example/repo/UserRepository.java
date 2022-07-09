package com.spring_boot.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_boot.example.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
