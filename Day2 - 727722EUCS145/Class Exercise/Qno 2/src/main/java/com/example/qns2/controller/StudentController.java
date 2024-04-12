package com.example.qns2.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.qns2.model.Student;

@RestController
public class StudentController {
    @PostMapping("/students")
    public String nameAge()
    {
        Student s=new Student("Sona", 20);
        return "Student created:"+s.getName()+",Age:"+s.getAge();
    }
    
}
