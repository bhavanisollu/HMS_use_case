package com.lnt.hotal.reservation.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lnt.hotal.reservation.service.entity.Room;

@FeignClient("hotel-rooms-service")
public interface RoomsFeignClient {

	@RequestMapping(method = RequestMethod.GET, value = "v1/hotels/{hotelId}/rooms/{roomId}", consumes = "application/json")
	Room getRoom(@PathVariable("hotelId") String hotelId, @PathVariable("roomId") String roomId);
}