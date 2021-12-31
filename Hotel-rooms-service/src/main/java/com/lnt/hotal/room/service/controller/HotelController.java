package com.lnt.hotal.room.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.hotal.room.service.constants.APIConstants;
import com.lnt.hotal.room.service.entity.Hotel;
import com.lnt.hotal.room.service.responses.APIResponse;
import com.lnt.hotal.room.service.service.HotelService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = APIConstants.API_HRS)
public class HotelController {
	
	@Autowired
	HotelService hservice;
	
	
	@PostMapping("/addHotel")
	public APIResponse addHotel(@RequestBody Hotel hobj) {
		return hservice.addHotel(hobj);
	}
	
	@GetMapping("/getHotel")
	public APIResponse getHotel() {
		return hservice.getHotel();
	}
}
