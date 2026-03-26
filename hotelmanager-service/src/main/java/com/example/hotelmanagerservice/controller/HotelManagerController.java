package com.example.hotelmanagerservice.controller;

import com.example.hotelmanagerservice.model.Hotelmanager;
import com.example.hotelmanagerservice.service.HotelManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotelmanager")
public class HotelManagerController {
    @Autowired
    HotelManagerService service;

    @PostMapping("/save")
    public Hotelmanager save(@RequestBody Hotelmanager manager){
        return service.save(manager);
    }


}
