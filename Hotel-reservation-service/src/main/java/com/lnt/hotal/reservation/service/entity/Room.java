package com.lnt.hotal.reservation.service.entity;

public class Room {

	private String roomId;
	private int hotalId;
	private int capacity;
	private String facilities;
	private double prize ;
	private String roomNumber;
	private String type;
	
	
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
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", hotalId=" + hotalId + ", capacity=" + capacity + ", facilities="
				+ facilities + ", prize=" + prize + ", roomNumber=" + roomNumber + ", type=" + type + "]";
	}
	
}
