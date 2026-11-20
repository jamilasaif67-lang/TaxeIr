package com.example.TaxeIr.ws;

import com.example.TaxeIr.Entity.Employee;
import com.example.TaxeIr.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeWs {

    private final EmployeeService employeeService;

    public EmployeeWs(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }


    @GetMapping
    public List<Employee> findAll() {
        return employeeService.findAll();
    }


    @GetMapping("/{id}")
    public Employee findById(@PathVariable Long id) {
        return employeeService.findById(id);
    }


    @GetMapping("/cin/{cin}")
    public Employee findByCin(@PathVariable String cin) {
        return employeeService.findByCin(cin);
    }


    @PutMapping("/{id}")
    public Employee update(
            @PathVariable Long id,
            @RequestBody Employee employee) {

        return employeeService.update(id, employee);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        employeeService.delete(id);
    }
}