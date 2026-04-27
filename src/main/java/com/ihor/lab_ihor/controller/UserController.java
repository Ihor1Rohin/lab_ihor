package com.ihor.lab_ihor.controller;

import com.ihor.lab_ihor.model.UserProfile;
import com.ihor.lab_ihor.service.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping
    public List<UserProfile> allUsers() {
        return userService.getAllUsers();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/{id}")
    public UserProfile userById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }
}