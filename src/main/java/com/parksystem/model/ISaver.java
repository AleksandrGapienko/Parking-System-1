package com.parksystem.model;

public interface ISaver {
	void saveParkingSystem(ParkingSystem ps);
	
	ParkingSystem restoreParkingSystem();
}
