package com.example.GestionEmp.repository;
import com.example.GestionEmp.model.Employe;
import org.springframework.data.jpa.repository.JpaRepository;


public interface employeRepository extends JpaRepository<Employe,Long> {
}


