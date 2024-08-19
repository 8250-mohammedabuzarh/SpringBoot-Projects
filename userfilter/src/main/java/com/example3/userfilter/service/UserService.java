package com.example3.userfilter.service;

import com.example3.userfilter.model.User;
import com.example3.userfilter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> filterUsers(Integer age, String city) {
        if (age != null && city != null) {
            return userRepository.findByAgeAndCity(age, city);
        }  else {
            return userRepository.findAll();
        }
    }




}

