package com.example.demo.domain;

import jakarta.persistence.Entity; // Marks this class as a database entity
import jakarta.persistence.Id;     // Tells which field is the primary key
import jakarta.persistence.Table;

@Entity  // This tells Spring that this class should be stored in a database table
@Table (name = "users") //connect with DB
public class Login {

    @Id // Primary key of the table
    private Long id;

    private String username;
    private String password;

    // Getter returns the value of 'id'
    public Long getId() {
        return id;
    }

    // Setter sets the value of 'id'
    public void setId(Long id) {
        this.id = id;
    }

    // Username getter/setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Password getter/setter
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
