package com.kaiofanjos.projeto_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaiofanjos.projeto_spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
		
}
