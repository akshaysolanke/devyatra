package com.bookingservice.dto;

import lombok.Data;

@Data
public class HotelDto {
    private int hotelId;
    private String hotelName;
    private String hotelLocation;
    private String hotelDescription;
    private double hotelPrice;
    private int managerId;
}
