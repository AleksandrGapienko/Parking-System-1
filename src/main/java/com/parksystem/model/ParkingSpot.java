package com.parksystem.model;


import com.parksystem.model.Vehicle;
import com.parksystem.model.VehicleSize;

public class ParkingSpot {

	private Vehicle vehicle;
	private VehicleSize spotSize;
	private int row;
	private int spotNumber;
	private Level level;

	public ParkingSpot(Level level, int r, int n, VehicleSize sz) {
		this.level = level;
		row = r;
		spotNumber = n;
		spotSize = sz;
	}

	boolean isbusy() {
		if (vehicle != null) {
			return true;
		} else {
			return false;
		}
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getSpotNumber() {
		return spotNumber;
	}

	public void setSpotNumber(int spotNumber) {
		this.spotNumber = spotNumber;
	}

	public VehicleSize getSpotSize() {
		return spotSize;
	}

	public void setSpotSize(VehicleSize spotSize) {
		this.spotSize = spotSize;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void removeVehicle() {
		this.vehicle = null;
	}
}
