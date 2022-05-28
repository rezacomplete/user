package com.jobclubofficial.user.controller;

import com.jobclubofficial.user.entity.User;
import com.jobclubofficial.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/{username}")
    public User getUser(@PathVariable String username) {
        return userService.getUser(username);
    }
}
