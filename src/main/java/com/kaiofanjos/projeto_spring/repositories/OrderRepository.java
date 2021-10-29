package com.kaiofanjos.projeto_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaiofanjos.projeto_spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
		
}
