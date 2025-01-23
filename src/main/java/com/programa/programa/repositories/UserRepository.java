package com.programa.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programa.programa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
		
}
