package com.javaspringboot.spring.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaspringboot.spring.model.Supervisor;
import com.javaspringboot.spring.repository.SupervisorRepository;

@Service
@Transactional
public class SupervisorService {

    private SupervisorRepository supervisorRepository;

    public SupervisorService(SupervisorRepository supervisorRepository) {
        this.supervisorRepository = supervisorRepository;
    }

    public List<Supervisor> allSupervisor() {
        return supervisorRepository.findAll();
    }

    public Supervisor findSupervisor(Integer id) {
        Optional<Supervisor> optionalSupervisor = supervisorRepository.findById(id);
        if (optionalSupervisor.isPresent()) {
            return optionalSupervisor.get();
        } else {
            throw new NoSuchElementException("Supervisor no encontrado con ID: " + id);
        }
    }
}
