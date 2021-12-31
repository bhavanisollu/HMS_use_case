package com.lnt.hotal.reservation.service.service;

import java.util.List;

import com.lnt.hotal.reservation.service.entity.Reservation;

public interface HotalReservationService {

	List<Reservation> getReservationsByHotelIdAndRoomId(String hotelId, String roomId);

}
