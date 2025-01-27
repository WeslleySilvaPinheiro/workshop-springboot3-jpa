package com.programa.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programa.programa.entities.Order;

//optional notation 
public interface OrderRepository extends JpaRepository<Order, Long>{
		
}
