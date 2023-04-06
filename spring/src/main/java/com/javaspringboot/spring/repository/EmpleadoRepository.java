package com.javaspringboot.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspringboot.spring.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado,Integer>{
    
}
