package com.example.hotelservice.controller;

import com.example.hotelservice.model.Hotel;
import com.example.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelservice;

    @PostMapping("/registerHotel")
    public Hotel register(@RequestBody Hotel hotel){
        return hotelservice.register(hotel);
    }

    @GetMapping("/getHotelById/{hotelId}")
    public Hotel getHotelById(@PathVariable int hotelId){
        return hotelservice.getHotelById(hotelId);
    }
}
