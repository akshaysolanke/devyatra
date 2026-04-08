package com.example.adminservice.repository;

import com.example.adminservice.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<Users, String> {
}
