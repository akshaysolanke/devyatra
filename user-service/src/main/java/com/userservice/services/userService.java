package com.userservice.services;


import com.userservice.model.Users;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface userService {
    public void saveUser(Users users);

    public String getUser(String userId);

    public List<Users> getAllUsers();

    public void deleteUserById(String userId);
}
