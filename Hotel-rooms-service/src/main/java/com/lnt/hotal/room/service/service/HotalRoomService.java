package com.lnt.hotal.room.service.service;

import com.lnt.hotal.room.service.entity.Room;
import com.lnt.hotal.room.service.responses.APIResponse;

public interface HotalRoomService {

	Room getRoomByHotelIdAndRoomNumber(String hotelId, String roomNumber);
	APIResponse getHotalroomById(String roomId);

}
