package com.lnt.hotal.room.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Hotel")
public class Hotel extends HotalBase {
	
	
	@Column(name = "Hotel_name")
	private String hotelName;

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(long hotelId, String hotelName) {
		super();
		//this.hotelId = hotelId;
		this.hotelName = hotelName;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + "]";
	}

	
}
