package com.rest.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rest.demo.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{


}
