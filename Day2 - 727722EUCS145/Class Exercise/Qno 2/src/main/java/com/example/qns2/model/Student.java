package com.example.qns2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {

    @JsonProperty("Student created")
    private String name;
    @JsonProperty("Age")
    private int age;
    public String getName() {
        return name;
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
