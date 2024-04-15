package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    StudentRepo r;
    public Student insertDetails(Student s)
    {
        return r.save(s);
    }
}
