package com.lambdaschool.anywherefitness.repositories;


import com.lambdaschool.anywherefitness.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository
        extends CrudRepository<User, Long> {

    User findByUsername(String username);
}

