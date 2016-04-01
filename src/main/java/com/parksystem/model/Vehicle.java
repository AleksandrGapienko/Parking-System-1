package com.parksystem.model;

import java.util.ArrayList;

public abstract class Vehicle {

    Vehicle() {

    }

    Vehicle(String licensePlate) {

        this.licensePlate = licensePlate;

    }

    Vehicle(ParkingSpot spot, String licensePlate) {
        this.spot = spot;
        this.licensePlate = licensePlate;
    }

    protected String licensePlate;
    protected int spotsNeeded;
    protected VehicleSize size;
    protected ParkingSpot spot;


    public int getSpotsNeeded() {
        return spotsNeeded;
    }

    public VehicleSize getSize() {
        return size;
    }

    public void parkInSpot(ParkingSpot spot) {
    }

    public void clearSpots(ParkingSpot spot) {
        spot.removeVehicle();
    }

    public abstract boolean canFitInSpot(ParkingSpot spot);

    public abstract void print();
}
