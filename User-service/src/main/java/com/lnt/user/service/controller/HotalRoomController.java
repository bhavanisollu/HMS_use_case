/**
 * 
 */
package com.lnt.user.service.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.user.service.constants.APIConstants;
import com.lnt.user.service.responses.APIResponse;
import com.lnt.user.service.service.UserService;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = APIConstants.API_HRS)
public class HotalRoomController {

	private final Logger LOG = LogManager.getLogger(HotalRoomController.class);

	@Autowired
	private UserService userService;

	@PostMapping(value = APIConstants.TEST_METHOD)
	public APIResponse reservation()  {
		LOG.info("alarmsService");
		return userService.registration();

	}
}
