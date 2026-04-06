package com.example.adminservice.repository;

import com.example.adminservice.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface adminRepo extends JpaRepository<Admin, Integer> {

}
