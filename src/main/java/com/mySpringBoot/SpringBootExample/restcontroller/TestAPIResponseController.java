package com.mySpringBoot.SpringBootExample.restcontroller;

import com.mySpringBoot.SpringBootExample.entity.User;
import com.mySpringBoot.SpringBootExample.service.svc.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestAPIResponseController {

    @Autowired
    private UserService  userService;

    @GetMapping("/v1/getAllUsersFromSpringBoot")
    public List<User> getAlUsers(){
        
        return userService.getAllUsers();
    }

    @GetMapping("/v1/getUserFromSpringBoot/{id}")
    public User getUserById(@PathVariable final Integer id){
        return userService.getUserById(id);
    }
}
