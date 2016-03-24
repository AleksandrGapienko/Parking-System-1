package com.parksystem.model;


import com.parksystem.model.Vehicle;
import com.parksystem.model.VehicleSize;

public class ParkingSpot {
	
	private Vehicle vehicle;
	private VehicleSize spotSize;
	private int row;
	private int spotNumber;
	private Level level;
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public VehicleSize getSpotSize() {
		return spotSize;
	}

	public int getRow() {
		return row;
	}

	public int getSpotNumber() {
		return spotNumber;
	}

	public Level getLevel() {
		return level;
	}

	public ParkingSpot(Level lvl, int r, int n, VehicleSize sz) {
		level = lvl;
		row = r;
		spotNumber = n;
		spotSize = sz;
	}

}
