package com.programa.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programa.programa.entities.Category;

//optional notation 
public interface CategoryRepository extends JpaRepository<Category, Long>{
		
}
