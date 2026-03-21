package com.example.admin.adminRepo;

import com.example.admin.adminModel.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface aRepository extends JpaRepository<Admin,Integer> {
}
