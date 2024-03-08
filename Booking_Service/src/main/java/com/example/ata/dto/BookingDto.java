package com.example.ata.dto;

import java.util.Date;

public class BookingDto {
	private int bookingId;
	private Date bookingDate;
	private Date journeyDate;
	private String source;
	private String destination;
	private String boardingpoint;
	private String dropingPoint;
	private int noOfPassengers;
	private boolean status;
	
	private RouteDto routeDto;
	private VehicleDto vehicleDto;
	private DriverDto driverDto;
	
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getBoardingpoint() {
		return boardingpoint;
	}
	public void setBoardingpoint(String boardingpoint) {
		this.boardingpoint = boardingpoint;
	}
	public String getDropingPoint() {
		return dropingPoint;
	}
	public void setDropingPoint(String dropingPoint) {
		this.dropingPoint = dropingPoint;
	}
	public int getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public DriverDto getDriverDto() {
		return driverDto;
	}
	public void setDriverDto(DriverDto driverDto) {
		this.driverDto = driverDto;
	}
	public RouteDto getRouteDto() {
		return routeDto;
	}
	public void setRouteDto(RouteDto routeDto) {
		this.routeDto = routeDto;
	}
	public VehicleDto getVehicleDto() {
		return vehicleDto;
	}
	public void setVehicleDto(VehicleDto vehicleDto) {
		this.vehicleDto = vehicleDto;
	}

	
}
