/**
 * 
 */
package com.lnt.hotal.room.service.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.hotal.room.service.constants.APIConstants;
import com.lnt.hotal.room.service.entity.Room;
import com.lnt.hotal.room.service.responses.APIResponse;
import com.lnt.hotal.room.service.service.HotalRoomService;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = APIConstants.API_HRS)
public class HotalRoomController {

	private final Logger logger = LogManager.getLogger(HotalRoomController.class);

	@Autowired
	private HotalRoomService roomService;

	@RequestMapping(value="/getroom/{roomId}",method = RequestMethod.GET)
	public APIResponse getRoom(@PathVariable("hotelId") String hotelId, @PathVariable("roomId") String roomId){
		logger.debug("hotel-rooms-service  getRoom(). ");
		return roomService.getHotalroomById(roomId);
	}
	
	@RequestMapping(value= {"/room-number/{roomNumber}"},method = RequestMethod.GET)
	public Room getRoomByHotelIdAndRoomNumber(@PathVariable("hotelId") String hotelId, @PathVariable("roomNumber") String roomNumber){
		logger.debug("hotel-rooms-service  getRoomByHotelIdAndRoomNumber(). ");
		return roomService.getRoomByHotelIdAndRoomNumber(hotelId, roomNumber);
	}
	
}
