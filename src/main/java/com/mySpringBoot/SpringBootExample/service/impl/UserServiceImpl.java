package com.mySpringBoot.SpringBootExample.service.impl;

import com.mySpringBoot.SpringBootExample.entity.User;
import com.mySpringBoot.SpringBootExample.repository.UserRepository;
import com.mySpringBoot.SpringBootExample.service.svc.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Integer userId) {
        return userRepository.getUserById(userId);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
