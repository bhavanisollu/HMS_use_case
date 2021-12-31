package com.lnt.hotal.room.service.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnt.hotal.room.service.constants.ResponseConstants;
import com.lnt.hotal.room.service.entity.Hotel;
import com.lnt.hotal.room.service.repository.HotelRepository;
import com.lnt.hotal.room.service.responses.APIResponse;
import com.lnt.hotal.room.service.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	HotelRepository hotelrepo;
	
	@Autowired
	APIResponse apiResponse;
	
	@Override
	public APIResponse addHotel(Hotel obj) {
		try {
			boolean flag = false;
			if(obj.getHotelName() == "") {
				flag = true;
				apiResponse.setMessage("The hotel name cannot be empty.");
				apiResponse.setStatus(ResponseConstants.FAIL);
				apiResponse.setStatusCode(ResponseConstants.BAD_REQUEST);
				apiResponse.setData(null);
			}
			
			List<Hotel> db_obj = findHotelByName(obj.getHotelName());
			
			if(!db_obj.isEmpty()) {
				apiResponse.setMessage("The hotel "+obj.getHotelName()+" is already registered");
				apiResponse.setStatus(ResponseConstants.FAIL);
				apiResponse.setStatusCode(ResponseConstants.BAD_REQUEST);
				apiResponse.setData(db_obj);
			}
			
			else if(!flag){
				hotelrepo.save(obj);
				apiResponse.setStatus(ResponseConstants.STATUS);
				apiResponse.setMessage(ResponseConstants.STATUS);
				apiResponse.setStatusCode(ResponseConstants.OK);
				apiResponse.setData(null);
			}
			
		}
		catch(Exception e) {
			apiResponse.setMessage(ResponseConstants.EXCEPTION_OCCURED);
			apiResponse.setStatus(ResponseConstants.FAIL);
			apiResponse.setStatusCode(ResponseConstants.EXCEPTION);
			apiResponse.setData(null);
		}
		return apiResponse;
	}

	@Override
	public APIResponse getHotel() {
		try {
			List<Hotel> hotelList = hotelrepo.findAll(); 
			//System.out.println(hotelList);
			if(!hotelList.isEmpty()) {
				apiResponse.setMessage(ResponseConstants.STATUS);
				apiResponse.setStatus(ResponseConstants.STATUS);
				apiResponse.setStatusCode(ResponseConstants.OK);
				apiResponse.setData(hotelList);
			}
			else {
				apiResponse.setMessage(ResponseConstants.NO_DATA);
				apiResponse.setStatus(ResponseConstants.STATUS);
				apiResponse.setStatusCode(ResponseConstants.BAD_REQUEST);
				apiResponse.setData(hotelList);
			}
		} catch (Exception e) {
			apiResponse.setMessage(ResponseConstants.EXCEPTION_OCCURED);
			apiResponse.setStatus(ResponseConstants.FAIL);
			apiResponse.setStatusCode(ResponseConstants.EXCEPTION);
			apiResponse.setData(null);
		}
		return apiResponse;
	}

	@Override
	public List<Hotel> findHotelByName(String hotelName) {
		return hotelrepo.findByHotelName(hotelName);
	}

}
