package com.kaiofanjos.projeto_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaiofanjos.projeto_spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
		
}
