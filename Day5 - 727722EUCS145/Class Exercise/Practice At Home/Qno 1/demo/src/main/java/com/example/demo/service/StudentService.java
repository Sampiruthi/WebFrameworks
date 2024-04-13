package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
    @Autowired
    StudentRepo repo;
    public Student saveStudent(Student s)
    {
        return repo.save(s);
    }
    public Student update(Student t,int studentId)
    {
        return repo.save(t);
    }
    public void deleteDetails(int studentId)
    {
        repo.deleteById(studentId);
    }
}