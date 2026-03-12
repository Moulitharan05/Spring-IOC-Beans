package com.example.feedbackapp.entity;

import jakarta.persistence.*;

@Entity
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String bookName;
    private String feedback;

    public Feedback() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBookName() {
        return bookName;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}