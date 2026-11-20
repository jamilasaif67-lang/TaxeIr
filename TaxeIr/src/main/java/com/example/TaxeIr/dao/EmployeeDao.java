package com.example.TaxeIr.dao;

import com.example.TaxeIr.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeDao extends JpaRepository<Employee, Long> {

    Optional<Employee> findByCin(String cin);

}