package com.kaiofanjos.projeto_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaiofanjos.projeto_spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
		
}
