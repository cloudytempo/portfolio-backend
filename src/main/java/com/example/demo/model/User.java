package com.example.demo.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    private String user_fullname;
    private String user_email;

    public User() {}

    public User(Long id, String user_fullname, String user_email) {
        this.user_id = id;
        this.user_fullname = user_fullname;
        this.user_email = user_email;
    }

    // Getters and Setters
    public Long getId() { return user_id; }
    public void setId(Long user_id) { this.user_id = user_id; }

    public String getUser_fullname() { return user_fullname; }
    public void setUser_fullname(String user_fullname) { this.user_fullname = user_fullname; }

    public String getUser_email() { return user_email; }
    public void setUser_email(String user_email) { this.user_email = user_email; }
}
