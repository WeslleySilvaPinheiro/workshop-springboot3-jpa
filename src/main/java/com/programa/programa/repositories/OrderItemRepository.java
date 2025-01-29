package com.programa.programa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programa.programa.entities.OrderItem;
import com.programa.programa.entities.pk.OrderItemPK;

//optional notation 
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
		
}
