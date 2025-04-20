package com.example.demo.controller;

import com.example.demo.domain.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller  // This marks the class as a controller in Spring MVC
public class LoginController {

    // Shows login form on GET request
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("login", new Login()); // Create an empty login object and send to view
        return "login";  // Returns login.html
    }

    // Handles POST request when user submits login form
    @PostMapping("/login")
    public String doLogin(@ModelAttribute("login") Login login, Model model) {
        // Check if username is "user" and password is "pass"
        if ("user".equals(login.getUsername()) && "pass".equals(login.getPassword())) {
            return "welcome"; // If login is successful, go to welcome.html
        } else {
            model.addAttribute("error", "Invalid credentials!"); // Add error message
            return "login"; // Reload login page with error
        }
    }
}
