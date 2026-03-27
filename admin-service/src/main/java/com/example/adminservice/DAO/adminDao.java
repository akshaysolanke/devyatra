package com.example.adminservice.DAO;

import com.example.adminservice.models.Admin;
import com.example.adminservice.models.Users;
import com.example.adminservice.repository.adminRepo;
import com.example.adminservice.services.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class adminDao implements adminService {

    @Autowired
    adminRepo ar;

    @Autowired
    RestTemplate rt;


    @Override
    public List<Users> getallusers() {

        ArrayList t1= rt.getForObject("http://localhost:8080/users/getAllUsers", ArrayList.class);
        return t1;
    }

    @Override
    public  Users getsingleuser(String userId) {
        ArrayList t1=rt.getForObject("http://localhost:8080/users/getUser/"+userId, ArrayList.class);
        Users a1= ar.findByUserId(userId);
        return a1.setItems(t1);

    }
}
