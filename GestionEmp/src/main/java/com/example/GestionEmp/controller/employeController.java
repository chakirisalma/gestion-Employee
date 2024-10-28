package com.example.GestionEmp.controller;

import com.example.GestionEmp.model.Employe;
import com.example.GestionEmp.Service.employeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Employe")
public class employeController {

    @Autowired
    private final employeService service;

    public employeController(employeService service) {
        this.service = service;
    }

    @GetMapping
    public List<Employe> getAllEmploye() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Employe getEmployeById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Employe createEmploye (@RequestBody Employe employee) {
        return service.save(employee);
    }

    @PutMapping("/{id}")
    public Employe updateEmploye(@PathVariable Long id, @RequestBody Employe employee) {
        employee.setId(id);
        return service.save(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmploye(@PathVariable Long id) {
        service.deleteById(id);
    }
}
