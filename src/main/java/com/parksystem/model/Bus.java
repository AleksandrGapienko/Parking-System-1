package com.parksystem.model;

public class Bus extends Vehicle{


	Bus(String licensePlate) {
		super(licensePlate);

		spotsNeeded = 1;

		size = VehicleSize.Large;
	}

	Bus(ParkingSpot spot, String licensePlate) {
		super(spot, licensePlate);

		spot.setVehicle(this);

		spotsNeeded = 1;

		size = VehicleSize.Large;
	}

	@Override
	public boolean canFitInSpot(ParkingSpot spot) {

		if (spot.getSpotSize().equals(size)) {
			return true;
		} else return false;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Bus");
	}

}
