package com.userservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Users {
    @Id
    private String userId;
    private String firstName;
    private String lastName;
    private String userEmail;
    private String contact;
    private String gender;
    private String age;
    private String userAddress;
    @Column(columnDefinition = "varchar(20) default 'User'")
    private String role;
    private String userPass;
    @Column(columnDefinition = "varchar(20) default 'Pending'")
    private String userStatus;
    @Transient
    private List<Booking> bookings = new ArrayList<>();

}
