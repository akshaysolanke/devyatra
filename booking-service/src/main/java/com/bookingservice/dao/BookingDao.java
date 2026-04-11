package com.bookingservice.dao;

import com.bookingservice.dto.HotelDto;
import com.bookingservice.external.HotelRoomClient;
import com.bookingservice.model.Booking;
import com.bookingservice.repository.BookingRepo;
import com.bookingservice.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingDao implements BookingService {
    @Autowired
    private BookingRepo bookingRepo;

    @Autowired
   private HotelRoomClient client;


    @Override
    public String createBooking(Booking booking) {
        bookingRepo.save(booking);
        return null;
    }

    @Override
    public Booking getBookingById(String bookingId) {
        return bookingRepo.findById(bookingId).orElse(null);
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepo.findAll();
    }

    @Override
    public List<Booking> getBookingByUserId(String userId) {
        return bookingRepo.findByUserId(userId);
    }




}
