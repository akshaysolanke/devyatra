package com.example.adminservice.controller;

import com.example.adminservice.models.Admin;
import com.example.adminservice.models.Users;
import com.example.adminservice.services.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/admin")
public class adminController {

        @Autowired
        adminService as;

        @GetMapping("/getallusers")
        public List<Users> fetchall()
        {
            return as.getallusers();
        }

        @GetMapping("/getsingleuser/{userId}")
        public Users getsingleuser(@PathVariable String userId)
        {
           return as.getsingleuser(userId);
        }



}
