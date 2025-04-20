package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.domain.Login;

@Repository // Marks this interface as a Spring Data Repository
public interface LoginRepo extends JpaRepository<Login, Long> { //why long?
    
    // Custom method to search login by username and password
    Login findByUsernameAndPassword(String username, String password);
    // Login findByUsernameAndPassword(String username);

}
