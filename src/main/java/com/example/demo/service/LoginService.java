package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.domain.Login;
import com.example.demo.repository.LoginRepo;

@Service // Tells Spring this is a service class
public class LoginService {

    @Autowired // tells Spring to automatically inject the LoginRepo bean into LoginService class
    private LoginRepo repo; // Injecting the repository to talk to DB

    // Authenticates the user
    public boolean authenticate(Login login) {
        // Check if login with this username and password exists in DB
        Login validLogin = repo.findByUsernameAndPassword(login.getUsername(), login.getPassword());
        return validLogin != null; // returns true if user exists
    }
}
