package com.example.user.userDAO;

import com.example.user.userModel.User;
import com.example.user.userRepository.userRepo;
import com.example.user.userService.uService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userDao implements uService {

    @Autowired
    userRepo ur;

    @Override
    public void saveuser(User u1) {
        ur.save(u1);
    }

    @Override
    public List<User> getallusers() {
        return ur.findAll();
    }
}
