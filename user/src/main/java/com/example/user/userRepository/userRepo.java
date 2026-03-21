package com.example.user.userRepository;

import com.example.user.userModel.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<User,Integer> {

}
