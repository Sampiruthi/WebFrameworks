package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentService ser;
    @Autowired
    StudentRepo repo;
    @PostMapping("/api/student")
    public void insert(@RequestBody Student s)
    {
        repo.save(s);
    }
    @GetMapping("/api/student")
    public List<Student> getDetails()
    {
        return repo.findAll();
    }
    @GetMapping("/api/student/{id}")
    public Optional<Student> getById(@PathVariable int id)
    {
        return repo.findById(id);
    }
}
