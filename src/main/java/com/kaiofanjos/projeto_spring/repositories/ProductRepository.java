package com.kaiofanjos.projeto_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaiofanjos.projeto_spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
		
}
