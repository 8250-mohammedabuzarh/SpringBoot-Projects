package com.example3.userfilter.controller;

import com.example3.userfilter.model.User;
import com.example3.userfilter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/filter")
    public List<User> filterUsers(@RequestParam(required = false) Integer age,
                                  @RequestParam(required = false) String city) {
        return userService.filterUsers(age, city);
    }
}

