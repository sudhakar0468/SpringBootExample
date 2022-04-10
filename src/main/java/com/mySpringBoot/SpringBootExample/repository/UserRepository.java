package com.mySpringBoot.SpringBootExample.repository;

import com.mySpringBoot.SpringBootExample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {


    @Override
    <S extends User> S save(S entity);

    @Override
    User getById(Integer integer);   // if we use this method. when entity is not found by id getting javax.persistence.EntityNotFoundException' exception

    User getUserById(final Integer id);

    @Override
    List<User> findAll();


}
