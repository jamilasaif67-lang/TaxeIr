
package com.example.TaxeIr.service;

import com.example.TaxeIr.Entity.Employee;
import com.example.TaxeIr.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }


    public Employee save(Employee employee) {
        return employeeDao.save(employee);
    }


    public List<Employee> findAll() {
        return employeeDao.findAll();
    }


    public Employee findById(Long id) {
        return employeeDao.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Employee not found with id: " + id));
    }

    public Employee findByCin(String cin) {
        return employeeDao.findByCin(cin)
                .orElseThrow(() ->
                        new RuntimeException("Employee not found with CIN: " + cin));
    }


    public Employee update(Long id, Employee employee) {

        Employee existingEmployee = findById(id);

        existingEmployee.setCin(employee.getCin());
        existingEmployee.setNom(employee.getNom());
        existingEmployee.setPrenom(employee.getPrenom());
        existingEmployee.setSalaireActuel(employee.getSalaireActuel());

        return employeeDao.save(existingEmployee);
    }


    public void delete(Long id) {
        Employee employee = findById(id);
        employeeDao.delete(employee);
    }
}
