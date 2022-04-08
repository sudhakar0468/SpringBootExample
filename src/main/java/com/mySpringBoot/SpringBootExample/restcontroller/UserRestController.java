package com.mySpringBoot.SpringBootExample.restcontroller;

import com.mySpringBoot.SpringBootExample.entity.User;
import com.mySpringBoot.SpringBootExample.service.svc.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping("/v1/getUser/{id}")
    public ResponseEntity getUserById(@PathVariable final Integer id){
       final User userObj= userService.getUserById(id);
       return new ResponseEntity(userObj, HttpStatus.OK);
       //if(userObj != null){
      //     return userObj;
      // }else {
      //     return new User();
      // }
       //return null;

    }

   // @PostMapping(value = "/v1/saveUser" , consumes = "application/json")
    public User saveUser(@RequestBody final User user) {

        return userService.save(user);
    }

    @PutMapping(value = "/v1/saveUser" , consumes = "application/json")
    public User putUser(@RequestBody final User user) {

        return userService.save(user);
    }

    @GetMapping("v1/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

}
