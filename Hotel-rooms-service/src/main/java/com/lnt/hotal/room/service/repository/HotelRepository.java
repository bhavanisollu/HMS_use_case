package com.lnt.hotal.room.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lnt.hotal.room.service.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
	
	List<Hotel> findByHotelName(String hotelName);
}
