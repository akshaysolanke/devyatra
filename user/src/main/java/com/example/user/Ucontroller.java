package com.example.user;

import com.example.user.userModel.User;
import com.example.user.userService.uService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Ucontroller {

    @Autowired
    uService us;

    @PostMapping("/user/saveuserdata")
    public String saverecord(@RequestBody User u1)
    {
        us.saveuser(u1);
        return "registered";
    }

    @GetMapping("/user/getallusers")
    public List<User> getallusers()
    {
        List<User>l1=us.getallusers();
        return l1;
    }
}

