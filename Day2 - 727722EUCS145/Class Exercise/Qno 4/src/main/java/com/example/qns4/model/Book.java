package com.example.qns4.model;

import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties.Data;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Book {
    public String title;
    public String author;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd")
    Data publicationData;
    public Book(String title, String author, Data publicationData) {
        this.title = title;
        this.author = author;
        this.publicationData = publicationData;
    }
}
