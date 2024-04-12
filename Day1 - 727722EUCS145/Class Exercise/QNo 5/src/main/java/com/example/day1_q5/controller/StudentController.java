package com.example.day1_q5.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day1_q5.model.Student;

import java.util.ArrayList;
import java.util.List;
@RestController
public class StudentController {
    @GetMapping("/student")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        Student obj = new Student();
        obj.setStudentName("John");
        obj.setMessage("Welcome, "+obj.getStudentName()+"!");
        students.add(obj);
        return students;
    }
}

