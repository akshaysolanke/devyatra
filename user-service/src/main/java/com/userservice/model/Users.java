package com.userservice.model;

import jakarta.persistence.*;

@Entity
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userId;
    private String firstName;
    private String lastName;
    private String userEmail;
    private String contact;
    private String gender;
    private String age;
    private String userAddress;
    @Column(columnDefinition = "String default User")
    private String role;
    private String userPass;
    @Column(columnDefinition = "String default Pending")
    private String userStatus;
    @Transient
    private List<Booking> bookings = new ArrayList<>();

}
