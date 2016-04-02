package com.parksystem.model;

public class Motorcycle extends Vehicle {


    Motorcycle() {

        size = VehicleSize.Motorcycle;

    }

    Motorcycle(String licensePlate) {

        super(licensePlate);

        spotsNeeded = 1;

        size = VehicleSize.Motorcycle;
    }

    Motorcycle(ParkingSpot spot, String licensePlate) {
        super(spot, licensePlate);

        spot.setVehicle(this);

        spotsNeeded = 1;

        size = VehicleSize.Motorcycle;
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
        System.out.println("Motorcycle");
    }

}
