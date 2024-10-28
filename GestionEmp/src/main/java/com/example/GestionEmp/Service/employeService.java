package com.example.GestionEmp.Service;

import com.example.GestionEmp.model.Employe;
import com.example.GestionEmp.repository.employeRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class employeService {

    private final employeRepository repository;

    public employeService(employeRepository repository) {
        this.repository = repository;
    }

    public List<Employe> findAll() { return repository.findAll(); }
    public Employe findById(Long id) { return repository.findById(id).orElse(null); }
    public Employe save(Employe employee) { return repository.save(employee); }
    public void deleteById(Long id) { repository.deleteById(id); }
}
