package com.lnt.user.service.responses;

import com.fasterxml.jackson.annotation.JsonInclude;


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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Long getTotalRecordCount() {
		return totalRecordCount;
	}

	public void setTotalRecordCount(Long totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	@Override
	public String toString() {
		return "APIResponse [message=" + message + ", status=" + status + ", statusCode=" + statusCode + ", data="
				+ data + ", totalRecordCount=" + totalRecordCount + "]";
	}

	public APIResponse(String message, String status, Integer statusCode, Object data, Long totalRecordCount) {
		super();
		this.message = message;
		this.status = status;
		this.statusCode = statusCode;
		this.data = data;
		this.totalRecordCount = totalRecordCount;
	}

	public APIResponse() {
		super();
	}
	

}
