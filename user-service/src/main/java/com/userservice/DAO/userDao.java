package com.userservice.DAO;

import com.userservice.model.Users;
import com.userservice.repository.userRepo;
import com.userservice.services.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userDao implements userService {

    @Autowired
    userRepo ur;

    @Override
    public void saveUser(Users users) {

        if(users.getRole()==null)
        {
            users.setRole("User");
        }
        if(users.getUserStatus()==null)
        {
            users.setUserStatus("pending");
        }
        ur.save(users);
    }

    @Override
    public Users getUser(String userId) {
        return ur.findById(userId).orElse(null);
    }

    @Override
    public List<Users> getAllUsers() {
        return ur.findAll();
    }

    @Override
    public void deleteUserById(String userId) {
        Users users = ur.findById(userId).orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));

        users.setUserStatus("inactive");
        ur.save(users);
    }
}
