package com.lnt.hotal.reservation.service.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lnt.hotal.reservation.service.entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{

	Collection<Reservation> findByRoomId(String roomId);

}
