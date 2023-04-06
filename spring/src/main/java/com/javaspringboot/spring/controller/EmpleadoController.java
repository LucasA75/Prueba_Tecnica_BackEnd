package com.javaspringboot.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaspringboot.spring.model.Empleado;
import com.javaspringboot.spring.service.EmpleadoService;


@CrossOrigin("*")
@RestController
public class EmpleadoController {
    
    private EmpleadoService empleadoService;

    public EmpleadoController(@Autowired EmpleadoService empleadoService){
        this.empleadoService = empleadoService;
    }

    /* Todos los empleados */
    @GetMapping("/employee")
    public List<Empleado> todosLosEmpleados(){
        return empleadoService.allEmpleado();
    }

    /* Ingresar un nuevo empleado */
    @PostMapping("/employee")
    public void ingresarEmpleado(@RequestBody Empleado empleado){
        empleadoService.saveEmpleado(empleado);
    }


    /* Actualizar un empleado */
    @PutMapping("/employee")
    public void actualizarEmpleado(@RequestBody Empleado empleado){
        empleadoService.updateEmpleado(empleado);
    }

}
