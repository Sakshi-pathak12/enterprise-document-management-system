package com.edms.backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edms.backend.dto.LoginRequest;
import com.edms.backend.dto.UserResponse;
import com.edms.backend.entity.User;
import com.edms.backend.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public UserResponse registerUser(@RequestBody User user) {

        User registeredUser = userService.registerUser(user);

        return new UserResponse(
                registeredUser.getId(),
                registeredUser.getName(),
                registeredUser.getEmail()
        );
    }

    @PostMapping("/login")
    public UserResponse loginUser(@RequestBody LoginRequest loginRequest) {

        User loggedInUser = userService.loginUser(
                loginRequest.getEmail(),
                loginRequest.getPassword()
        );

        return new UserResponse(
                loggedInUser.getId(),
                loggedInUser.getName(),
                loggedInUser.getEmail()
        );
    }
}