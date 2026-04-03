package com.example.hotelservice.repository;

import com.example.hotelservice.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Roomrepo extends JpaRepository<Room,Integer> {
    List<Room> findByAvailable(boolean available);
}
