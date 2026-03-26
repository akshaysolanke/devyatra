package com.example.hotelmanagerservice.DAO;

import com.example.hotelmanagerservice.model.Hotelmanager;
import com.example.hotelmanagerservice.repository.HotelManagerRepo;
import com.example.hotelmanagerservice.service.HotelManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class HotelmanagerDAO implements HotelManagerService {

    @Autowired
    HotelManagerRepo managerrepo;

    @Override
    public Hotelmanager save(Hotelmanager manager) {
        return managerrepo.save(manager);
    }

    @Override
    public List<Hotelmanager> getallmanagers(){
        return managerrepo.findAll();
    }

    @Override
    public Hotelmanager getManagerById(int id){
        return managerrepo.findById(id).orElse(null);
    }

    @Override
    public void deleteManagerById(int id){
        managerrepo.deleteById(id);
    }
}
