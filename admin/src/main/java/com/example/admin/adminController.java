package com.example.admin;

import com.example.admin.adminService.aService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class adminController {

    @Autowired
    aService as;
}
