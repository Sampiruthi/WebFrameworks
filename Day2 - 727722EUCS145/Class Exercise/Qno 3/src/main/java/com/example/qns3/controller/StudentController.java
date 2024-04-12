package com.example.qns3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.qns3.model.Student;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student msg()
    {
        Student s=new Student(1L, "Joe Dev", "This is a student description");
        return s;
    }
    
}
