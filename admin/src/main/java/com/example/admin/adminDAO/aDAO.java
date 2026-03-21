package com.example.admin.adminDAO;

import com.example.admin.adminRepo.aRepository;
import com.example.admin.adminService.aService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class aDAO implements aService {

    @Autowired
    aRepository ar;

}
