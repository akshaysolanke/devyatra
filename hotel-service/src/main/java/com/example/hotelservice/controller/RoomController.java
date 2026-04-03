package com.example.hotelservice.controller;

import com.example.hotelservice.model.Room;
import com.example.hotelservice.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomService roomservice;

    @PostMapping("/addRoom")
    public Room addRoom(@RequestBody Room room){
        return roomservice.addRoom(room);
    }

    @GetMapping("/getRoomById/{roomId}")
    public Room getRoomById(@PathVariable int roomId){
        return roomservice.getRoomById(roomId);
    }

    @GetMapping("/getAllRooms")
    public List<Room> getAllRooms(){
        return roomservice.getAllRooms();
    }

    @PutMapping("/updateRoom/{roomId}")
    public Room updateRoom(@RequestBody Room room){
        return roomservice.updateRoom(room);
    }

    @DeleteMapping("/deleteRoom/{roomId}")
    public String deleteRoom(@PathVariable int roomId){
        return roomservice.deleteRoom(roomId);
    }

    @GetMapping("/available")
    public List<Room> getAvailableRooms(){
        return roomservice.getAvailableRooms();
    }


}
