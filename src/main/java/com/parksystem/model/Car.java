package com.parksystem.model;

public class Car extends Vehicle {

	Car(String licensePlate) {

		super(licensePlate);

		spotsNeeded = 1;

		size = VehicleSize.Compact;
	}

	Car(ParkingSpot spot, String licensePlate) {
		super(spot, licensePlate);

		spot.setVehicle(this);

		spotsNeeded = 1;

	}

	public boolean canFitInSpot(ParkingSpot spot) {

		if (spot.getSpotSize().equals(size)) {
			return true;
		} else return false;
	}

	public void print() {
		System.out.print("Car");
	}
}
