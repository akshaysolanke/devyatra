package com.example.hotelservice.service;

import com.example.hotelservice.model.Room;

import java.util.List;

public interface RoomService {
    public Room addRoom(Room room);
    public Room getRoomById(int roomId);
    public List<Room> getAllRooms();
    public Room updateRoom(Room room);

    public String deleteRoom(int roomId);
    public List<Room> getAvailableRooms();
}
