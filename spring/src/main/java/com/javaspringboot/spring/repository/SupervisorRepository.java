package com.javaspringboot.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspringboot.spring.model.Supervisor;

public interface SupervisorRepository extends JpaRepository<Supervisor,Integer> {
    
}
