package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepo repo;
    @Autowired
    EmployeeService ser;
    @PostMapping("/api/employee")
    public void insert(@RequestBody Employee e)
    {
        ser.insertDetails(e);
    }
    @GetMapping("/api/employees")
    public List<Employee> getDetails()
    {
        return repo.findAll();
    }
    @GetMapping("/api/employee/{employeeId}")
    public Optional<Employee> getId(@PathVariable int employeeId)
    {
        return repo.findById(employeeId);
    }
}
