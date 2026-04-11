package com.example.hotelmanagerservice.controller;

import com.example.hotelmanagerservice.model.Room;
import com.example.hotelmanagerservice.service.HotelManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manager")
public class RoomController {

    @Autowired
    private HotelManagerService hotelManagerService;

    @PostMapping("/room/addRoom")
    public Room addRoom(@RequestBody Room room) {
        return hotelManagerService.addRoom(room);
    }

    @GetMapping("/room/getRoom/{roomId}")
    public Room getRoomById(@PathVariable int roomId) {
        return hotelManagerService.getRoomById(roomId);
    }

    @GetMapping("/room/getAllRooms")
    public List<Room> getAllRooms() {
        return hotelManagerService.getAllRooms();
    }

}
