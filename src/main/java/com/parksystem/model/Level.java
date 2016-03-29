package com.parksystem.model;

import java.util.Arrays;

public class Level {


    ParkingSpot[][] parkingspots;
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

        this.parkingspots = new ParkingSpot[row][spots];
        this.rows = row;
        this.spots = spots;

        for (int i = 0; i < row; i++) {

            int each = 0;
            int foreach = spots / VehicleSize.values().length;

            if ((spots % VehicleSize.values().length) != 0) {
                throw new Error("Please, specify an equal number of spots for all transport classes in the row.");
            }


            for (int j = 0; j < spots; j++, foreach--) {

                if (foreach == 0) {
                    each++;
                    foreach = spots / VehicleSize.values().length;
                }

                parkingspots[i][j] = new ParkingSpot(Level.this, i + 1, j + 1, VehicleSize.values()[each]);

            }
        }
    }

    public void Levelinfo() {

        for (int i = 0; i < rows; i++) {

            System.out.println("\t" + "#####" + " ROW № " + parkingspots[i][1].getRow() + " " + "#####");
            System.out.println();
            for (int j = 0; j < spots; j++) {

                System.out.println(" Spot No " + parkingspots[i][j].getSpotNumber() + "\t" + " Spot size: " + parkingspots[i][j].getSpotSize() + " \t" + " Vehicle: " + parkingspots[i][j].getVehicle() + "\t");

            }
            System.out.println();

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

