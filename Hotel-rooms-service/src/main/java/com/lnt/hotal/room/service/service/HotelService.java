package com.lnt.hotal.room.service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lnt.hotal.room.service.entity.Hotel;
import com.lnt.hotal.room.service.responses.APIResponse;


public interface HotelService {
	
	public APIResponse addHotel(Hotel obj);
	public APIResponse getHotel();
	
	public List<Hotel> findHotelByName(String hotelName);

}
