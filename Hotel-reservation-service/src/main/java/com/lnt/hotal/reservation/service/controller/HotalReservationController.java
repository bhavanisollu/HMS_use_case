/**
 * 
 */
package com.lnt.hotal.reservation.service.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.hotal.reservation.service.constants.APIConstants;
import com.lnt.hotal.reservation.service.entity.Reservation;
import com.lnt.hotal.reservation.service.service.HotalReservationService;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = APIConstants.API_HRS_RESERVATION)
public class HotalReservationController {

	private final Logger logger = LogManager.getLogger(HotalReservationController.class);

	@Autowired
	private HotalReservationService reservationService;

	@RequestMapping(value = "/{roomId}", method = RequestMethod.GET)
	public List<Reservation> getReservationsForRoom(@PathVariable("hotelId") String hotelId, @PathVariable("roomId") String roomId) {
		logger.debug("Entering the hotel-reservations-service  ");
		return reservationService.getReservationsByHotelIdAndRoomId(hotelId, roomId);
	}
}
