package com.example.vehicle.exception;

import java.util.Date;

public class VehicleException {

	
	private Date timestamp;
	
	private String message;
	
	private String details;

	public VehicleException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VehicleException(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
	
	
}
