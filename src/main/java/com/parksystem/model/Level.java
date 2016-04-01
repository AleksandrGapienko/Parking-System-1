package com.parksystem.model;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Level {


    LinkedList<ParkingSpot> parkingSpots;
    private int rows;
    private int spots;
    private int leveno;

    public int getLeveno() {
        return leveno;
    }

    public void setLeveno(int leveno) {
        this.leveno = leveno;
    }

    public int getSpots() {
        return spots;
    }

    public void setSpots(int spots) {
        this.spots = spots;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    Level(int row, int spots) {

        this.parkingSpots = new LinkedList<ParkingSpot>();
        this.rows = row;
        this.spots = spots;
        int spotno = 0;

        for (int i = 1; i < row+1; i++) {


            int each = 0;
            int foreach = spots / VehicleSize.values().length;

            if ((spots % VehicleSize.values().length) != 0) {
                throw new Error("Please, specify an equal number of spots for all transport classes in the row.");
            }


            for (int j = 1; j < spots+1; j++, foreach--) {

                if (foreach == 0) {
                    each++;
                    foreach = spots / VehicleSize.values().length;
                }

                spotno++;
                parkingSpots.add(new ParkingSpot(Level.this, i, spotno, VehicleSize.values()[each]));

            }
        }
    }

    public void Levelinfo() throws IOException{

        for (ParkingSpot parkingSpot : parkingSpots) {
            System.out.println("Row: " + parkingSpot.getRow()+" \t"+ "No: " + parkingSpot.getSpotNumber()+ " \t" + "Size: " + parkingSpot.getSpotSize()+ " \t\t"+ "Car: " + parkingSpot.getVehicle());
        }

    }

    // Test method
/*    public void addCar(int row, int spotsno, Vehicle veh) {

        //parkingspots[row-1][number-1].setVehicle(veh);
        if (veh.size.equals(parkingspots[row - 1][spotsno - 1].getSpotSize())) {
            parkingspots[row - 1][spotsno - 1].setVehicle(veh);
        } else {
            System.err.print("Error! Size is too small or too big for this vehicle.");
        }

    }*/

}

