package com.lnt.hotal.room.service.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.hotal.room.service.constants.APIConstants;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = APIConstants.API_HRS)		
public class HealthController {

	@RequestMapping("/actuator/health")
	void handleFoo(HttpServletResponse response) throws IOException {
		response.sendRedirect("/actuator/health");
	}

}
