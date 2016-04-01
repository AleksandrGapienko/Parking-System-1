package com.parksystem.model;

import java.io.*;
import java.util.LinkedList;

/**
 * Created by alex on 3/21/16.
 */
public class ParkingSystem  {


   LinkedList <Level> levels;
    int rows, spots;

    ParkingSystem(int how_many_levels, int rows, int spots) {

        this.spots = spots;
        this.rows = rows;


        levels = new LinkedList<Level>();
        for (int i = 0; i < how_many_levels; i++) {
            levels.add(new Level(rows, spots));
            levels.get(i).setLeveno(i + 1);
        }



    }

    public void getInfo() throws IOException{


        for (Level level : levels) {

            System.out.println("##### LEVEL № " + level.getLeveno() + " #####");
            System.out.println();
            level.Levelinfo();
            System.out.println();
        }


    }


    public void check(int level, int spotno) {

        System.out.println(levels.get(level).parkingSpots.get(spotno).isbusy());


    }

    public void addVehicle(int level, int spotno, Vehicle veh) {


        levels.get(level-1).parkingSpots.get(spotno-1).isbusy();
         if (levels.get(level-1).parkingSpots.get(spotno-1).isbusy()) {
            System.err.println("The spot is busy.");
            System.out.println();
        } else if (veh.size.equals(levels.get(level-1).parkingSpots.get(spotno-1).getSpotSize()) & levels.get(level-1).parkingSpots.get(spotno-1).isbusy() != true)  {
            levels.get(level-1).parkingSpots.get(spotno-1).setVehicle(veh);
             System.out.println("Vehicle was successfully set up.");
             System.out.println();
         }
         else {
            System.err.println("Error! The spot size is too small or too big for this vehicle.");

        }
    }



    public void removeVehicle(int level, int spotno) {


        if (levels.get(level-1).parkingSpots.get(spotno-1).isbusy()) {
            levels.get(level-1).parkingSpots.get(spotno-1).removeVehicle();
            System.out.println("Vehicle successfully was removed.");
            System.out.println();
        } else {
            System.err.println("Error! There is no any vehicle at this spot.");
            System.out.println();
        }


    }

}




