package com.lnt.hotal.reservation.service.responses;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

// TODO: Auto-generated Javadoc
/**
 * Generic response for all api.
 *
 * @author santsoh kumar
 */

/**
 * Hash code.
 *
 * @return the int
 */
@Data

/**
 * To string.
 *
 * @return the java.lang. string
 */
@ToString

/**
 * Instantiates a new API response.
 *
 * @param message the message
 * @param status the status
 * @param statusCode the status code
 */
@AllArgsConstructor

/**
 * Instantiates a new API response.
 */
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL) 
public class APIResponse {
	

	/** The message. */
	private String message;
	
	/** The status. */
	private String status;
	
	/** The status code. */
	private Integer statusCode;
	
	/** The result object */
	private Object data;
	
	private Long totalRecordCount;

}
