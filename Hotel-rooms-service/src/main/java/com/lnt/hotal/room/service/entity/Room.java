package com.lnt.hotal.room.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Hotalroom")
public class Room extends HotalBase{

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 2676143225306971651L;
	
	@Column(name = "hotal_id")
	private int hotalId;
	@Column(name="room_id")
	private String roomId;
	@Column(name = "capacity")
	private int capacity;
	@Column(name = "facilities")
	private String facilities;
	@Column(name = "prize")
	private double prize ;
	
	@Column(name="room_number")
	private String roomNumber;
	
	private String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public int getHotalId() {
		return hotalId;
	}
	public void setHotalId(int hotalId) {
		this.hotalId = hotalId;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getFacilities() {
		return facilities;
	}
	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	@Override
	public String toString() {
		return "Room [hotalId=" + hotalId + ", roomId=" + roomId + ", capacity=" + capacity + ", facilities="
				+ facilities + ", prize=" + prize + ", roomNumber=" + roomNumber + ", type=" + type + "]";
	}
	
	
	
}
