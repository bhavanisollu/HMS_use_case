package com.lnt.hotal.room.service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lnt.hotal.room.service.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

	Room findByHotelIdAndRoomNumber(String hotelId, String roomNumber);

	Optional<Room> findByRoomId(String roomId);

}
