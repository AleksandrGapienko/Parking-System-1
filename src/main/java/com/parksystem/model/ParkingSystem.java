package com.parksystem.model;

/**
 * Created by alex on 3/21/16.
 */
public class ParkingSystem {


    Level[] levels;
    int rows, spots;


    ParkingSystem(int levelss, int rows, int spots) {

        this.spots = spots;
        this.rows = rows;

        levels = new Level[levelss];
        for (int i = 0; i < levels.length; i++) {

            levels[i] = new Level(rows, spots);

            levels[i].setLeveno(i + 1);
        }

    }

    public void getInfo() {


        for (Level level : levels) {

            System.out.println("##### LEVEL № " + level.getLeveno() + " #####");
            System.out.println();
            level.Levelinfo();
        }


    }


    public void check(int level, int row, int spotno) {

        System.out.println(levels[level - 1].parkingspots[row - 1][spotno - 1].isbusy());

    }

    public void addVehicle(int level, int row, int spotno, Vehicle veh) {

        if (levels[level - 1].parkingspots[row - 1][spotno - 1].isbusy()) {
            System.err.println("The spot is busy.");
            System.out.println();
        } else if (veh.size.equals(levels[level - 1].parkingspots[row - 1][spotno - 1].getSpotSize()) & levels[level - 1].parkingspots[row - 1][spotno - 1].isbusy() != true) {
            levels[level - 1].parkingspots[row - 1][spotno - 1].setVehicle(veh);
        } else {
            System.err.println("Error! The spot size is too small or too big for this vehicle.");

        }
    }

    public void removeVehicle(int level, int row, int spotno) {

        if (levels[level - 1].parkingspots[row - 1][spotno - 1].isbusy()) {
            levels[level - 1].parkingspots[row - 1][spotno - 1].removeVehicle();
        } else {
            System.err.println("Error! There is no any vehicle at this spot.");
        }


    }

}




