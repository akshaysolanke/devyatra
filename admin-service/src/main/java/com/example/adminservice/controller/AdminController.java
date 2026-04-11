package com.example.adminservice.controller;

import com.example.adminservice.models.Users;
import com.example.adminservice.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService as;


    @GetMapping("/getallusers")
    public List<Users>getallusers()
    {
        return as.getallusers();
    }

    @GetMapping("/getsingleuser/{userId}")
    public Users getsingleuser(@PathVariable String userId)
    {
        return as.getsingleuser(userId);
    }

    @PutMapping("/deleteuser/{userId}")
    public String deleteuser(@PathVariable String userId)
    {
        as.deleteuser(userId);
        return "user inactivated";
    }



}
