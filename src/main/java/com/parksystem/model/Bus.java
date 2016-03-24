package com.parksystem.model;

public class Bus extends Vehicle{

	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Bus");
	}

}
