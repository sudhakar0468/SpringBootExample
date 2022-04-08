package com.mySpringBoot.SpringBootExample.service.svc;

import com.mySpringBoot.SpringBootExample.entity.User;

import java.util.List;

public interface UserService {

    User save(final User user);

    User getUserById(final Integer userId);

    List<User> getAllUsers();


}
