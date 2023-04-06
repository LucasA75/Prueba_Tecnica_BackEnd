package com.javaspringboot.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.javaspringboot.spring.model.Supervisor;
import com.javaspringboot.spring.service.SupervisorService;

@CrossOrigin("*")
@RestController
public class SupervisorController {
    
    private SupervisorService supervisorService;

    public SupervisorController(@Autowired SupervisorService supervisorService){
        this.supervisorService = supervisorService;
    }

    /* Ver todos los supervisores */
    @GetMapping("/supervisor")
    public List<Supervisor> todosLosSupervisores(){
        return supervisorService.allSupervisor();
    }

    /* Ver supervisor segun id */
    @GetMapping("/supervisor/{id}")
    public Supervisor getSupervisor(@PathVariable Integer id){
        return supervisorService.findSupervisor(id);
    }

}
