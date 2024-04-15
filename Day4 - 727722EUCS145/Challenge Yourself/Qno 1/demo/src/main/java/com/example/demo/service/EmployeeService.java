package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo r;
    public Employee insertDetails(Employee s)
    {
        return r.save(s);
    }
}
