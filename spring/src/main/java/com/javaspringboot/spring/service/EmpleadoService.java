package com.javaspringboot.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaspringboot.spring.model.Empleado;
import com.javaspringboot.spring.repository.EmpleadoRepository;

@Service
@Transactional
public class EmpleadoService {

    private EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository){
        this.empleadoRepository = empleadoRepository;
    }

    /* Ingresar un nuevo empleado */
    public void saveEmpleado(Empleado empleado){
        empleadoRepository.save(empleado);
    }

    /* Editar un empleado */
    public void updateEmpleado(Empleado empleado){
        empleadoRepository.save(empleado);
    }

    /* Mostrar todos los empleados */
    public List<Empleado> allEmpleado(){
           return empleadoRepository.findAll();
    }

    
}
