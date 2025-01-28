package com.programa.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programa.programa.entities.Product;

//optional notation 
public interface ProductRepository extends JpaRepository<Product, Long>{
		
}
