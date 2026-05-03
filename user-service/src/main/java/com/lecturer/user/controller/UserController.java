package com.lecturer.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/user/profile")
    public Map<String, Object> profile() {
        return Map.of("service", "user-service", "name", "lecture-demo-user", "role", "student");
    }
}
