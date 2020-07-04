package com.msprojects.expenseTracker.controllers;

import com.msprojects.expenseTracker.models.User;
import com.msprojects.expenseTracker.services.UserService.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/expensetracker")
public class RegistrationController {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/register")
    public Map<String, String> registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }
}
