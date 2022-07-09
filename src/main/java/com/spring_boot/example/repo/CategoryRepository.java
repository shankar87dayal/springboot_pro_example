package com.spring_boot.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_boot.example.entities.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
