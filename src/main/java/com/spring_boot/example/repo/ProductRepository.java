package com.spring_boot.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_boot.example.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
