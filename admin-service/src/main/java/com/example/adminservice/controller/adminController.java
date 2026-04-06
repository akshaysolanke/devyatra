package com.example.adminservice.controller;

import com.example.adminservice.models.Admin;
import com.example.adminservice.models.Users;
import com.example.adminservice.services.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/admin")
public class adminController {

        @Autowired
        adminService as;

        @PostMapping("/adminlogin")
        public String adminlogin(@RequestBody Admin a1)
        {
                if(a1.getAname().equals("akshay") && a1.getApassword().equals("akshay123") && a1.getRole().equals("admin"))
                {
                        return "login successful";
                }else{
                        return"login failed";
                }
        }

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

        @PostMapping("/deleteuser/{userId}")
        public String deleteuser(@PathVariable String userId)
        {
                as.deleteuser(userId);
                return "user inactivated";
        }



}
