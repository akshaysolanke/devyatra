package com.bookingservice.external;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "hotel-service")
public interface HotelRoomClient {

}
