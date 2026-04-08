package com.example.adminservice.DAO;
import com.example.adminservice.models.Users;
import com.example.adminservice.repository.adminRepo;
import com.example.adminservice.repository.userRepo;
import com.example.adminservice.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminDao implements AdminService {

    @Autowired
    adminRepo ar;

    @Autowired
    userRepo ur;

    @Autowired
    private RestTemplate rt;


    @Override
    public List<Users> getallusers() {
        ArrayList<Users> u1= rt.getForObject("http://localhost:8080/users/getAllUsers",ArrayList.class);
        return u1;
    }

    @Override
    public Users getsingleuser(String userId) {
        String url = "http://localhost:8080/users/getUser/"+ userId;
        return rt.getForObject(url, Users.class);
    }

    @Override
    public void deleteuser(String userId) {
       Users u1= rt.getForObject("http://localhost:8080/users/getUser/", Users.class);
       u1.setUserStatus("inactivated");
       ur.save(u1);
    }
}
