package com.lnt.hotal.room.service.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnt.hotal.room.service.constants.ResponseConstants;
import com.lnt.hotal.room.service.entity.Room;
import com.lnt.hotal.room.service.repository.RoomRepository;
import com.lnt.hotal.room.service.responses.APIResponse;
import com.lnt.hotal.room.service.service.HotalRoomService;

@Service
public class HotalReservationServiceImpl implements HotalRoomService {

	@Autowired
	RoomRepository jparepo;

	@Autowired
	private RoomRepository roomRepository;

	public Room getRoomByHotelIdAndRoomNumber(String hotelId, String roomNumber) {
		return roomRepository.findByHotelIdAndRoomNumber(hotelId, roomNumber);
	}

	@Override
	public APIResponse getHotalroomById(String roomId) {

		try {

			Optional<Room> roomData = jparepo.findByRoomId(roomId);
			if (roomData.isPresent()) {
				return new APIResponse(ResponseConstants.STATUS, ResponseConstants.STATUS, ResponseConstants.OK,
						roomData, null);
			} else {
				return new APIResponse(ResponseConstants.NO_DATA, ResponseConstants.STATUS, ResponseConstants.NOT_FOUND,
						roomData, null);
			}

		} catch (Exception e) {
			return new APIResponse(ResponseConstants.EXCEPTION_OCCURED, ResponseConstants.FAIL,
					ResponseConstants.EXCEPTION, null, null);
		}

	}

}
