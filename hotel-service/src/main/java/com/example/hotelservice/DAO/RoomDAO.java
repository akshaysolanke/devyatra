package com.example.hotelservice.DAO;

import com.example.hotelservice.model.Room;
import com.example.hotelservice.repository.Roomrepo;
import com.example.hotelservice.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomDAO implements RoomService {

    @Autowired
    private Roomrepo roomrepo;

    @Override
    public Room addRoom(Room room){
        return roomrepo.save(room);
    }

    @Override
    public Room getRoomById(int roomId){
        return roomrepo.findById(roomId).orElse(null);
    }

    @Override
    public List<Room> getAllRooms(){
        return roomrepo.findAll();
    }

    @Override
    public Room updateRoom(Room room){
        return roomrepo.save(room);
    }
    @Override
    public String deleteRoom(int roomId){
        roomrepo.deleteById(roomId);
        return "Room deleted successfully";
    }

    @Override
    public List<Room> getAvailableRooms(){
        return roomrepo.findByAvailable(true);
    }

    @Override
    public List<Room> getRoomsByHotelId(int hotelId){
        return roomrepo.findRoomByHotelId(hotelId);
    }
}
