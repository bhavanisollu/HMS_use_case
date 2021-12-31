package com.lnt.hotal.reservation.service.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "reservation")
public class Reservation extends HotalBase{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 2676143225306971651L;
	
	@Id
	@Column(name = "reservation_id", nullable = false)
	private String reservationId;
	
	@Column(name = "hotal_id")
	private int hotalId;
	@Column(name = "user_id")
	private int userId;
	@Column(name = "room_id")
	private String roomId;
	@Column(name = "guest_list")
	private String guestList;
	@Column(name = "check_in")
	private LocalDateTime checkIn ;
	@Column(name = "check_out")
	private LocalDateTime checkOut ;
	@Column(name = "balanceAmount")
	private double balance_amount ;
	
	@Column(name = "guest_id", nullable = false)
	private String guestId;
	@Column(name = "comment", nullable = false)
	private String comment;
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	@Transient	
	private Room room;
	
	public String getGuestId() {
		return guestId;
	}
	public void setGuestId(String guestId) {
		this.guestId = guestId;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public int getHotalId() {
		return hotalId;
	}
	public void setHotalId(int hotalId) {
		this.hotalId = hotalId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getGuestList() {
		return guestList;
	}
	public void setGuestList(String guestList) {
		this.guestList = guestList;
	}
	
	public LocalDateTime getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(LocalDateTime checkIn) {
		this.checkIn = checkIn;
	}
	public LocalDateTime getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(LocalDateTime checkOut) {
		this.checkOut = checkOut;
	}
	public double getBalance_amount() {
		return balance_amount;
	}
	public void setBalance_amount(double balance_amount) {
		this.balance_amount = balance_amount;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Reservation withReservationId(String reservationId) {
		this.setReservationId(reservationId);
		return this;
	}
	
	public String getReservationId() {
		return reservationId;
	}
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}
	public Reservation withRoomId(String roomId) {
		this.setRoomId(roomId);
		return this;
	}
	public Reservation withGuestId(String guestId) {
		this.setGuestId(guestId);
		return this;
	}
	public Reservation withCheckIn(LocalDateTime startDate) {
		this.setCheckIn(startDate);
		return this;
	}
	public Reservation withEndDate(LocalDateTime endDate) {
		this.setCheckOut(endDate);
		return this;
	}
	public Reservation withComment(String comment) {
		this.setComment(comment);
		return this;
	}
	public Reservation withRoom(Room room) {
		this.setRoom(room);
		return this;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	
	
}
