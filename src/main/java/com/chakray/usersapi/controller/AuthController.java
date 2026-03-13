package com.chakray.usersapi.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @PostMapping("/login")
    public String login() {
        return "Login endpoint working";
    }
}