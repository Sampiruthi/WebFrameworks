package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentRepo repo;
    @Autowired
    StudentService ser;
    @PostMapping("/student")
    public void save(@RequestBody Student s)
    {
        ser.saveStudent(s);
    }
    @GetMapping("/student")
    public List<Student> details(Student s)
    {
        return repo.findAll();
    }
    @GetMapping("/student/{studentId}")
    public Optional<Student> getId(@PathVariable int studentId)
    {
        return repo.findById(studentId);
    }
    @PutMapping("/student/{studentId}")
    public void updatedetails(@RequestBody Student s,@PathVariable int studentId)
    {
        ser.update(s,studentId);
    }
    @DeleteMapping("student/{studentId}")
    public void deleteDet(@PathVariable int studentId)
    {
        ser.deleteDetails(studentId);
    }
}