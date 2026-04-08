package com.example.adminservice.services;

import com.example.adminservice.models.Admin;
import com.example.adminservice.models.Users;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AdminService {

   public List<Users> getallusers();

   public Users getsingleuser(String userId);

   public void deleteuser(String userId);
}
