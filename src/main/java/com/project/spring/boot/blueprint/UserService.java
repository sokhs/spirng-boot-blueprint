package com.project.spring.boot.blueprint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final  UserRepo userRepo;

    public UserService(
            UserRepo userRepo
    ) {
        this.userRepo = userRepo;
    }

    public User getAllUsers() {
        Optional<User> usersOpt =  userRepo.findById(1);
        if (usersOpt.isPresent()) {
            return usersOpt.get();
        }
        return null;
    }

}
