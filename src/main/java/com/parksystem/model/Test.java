package com.parksystem.model;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.*;



public class Test {

    public static final Logger LOG = Logger.getLogger(Test.class);


    public static void main(String[] args) throws IOException {


        PropertyConfigurator.configure("log4j.properties");



        LOG.info("Entering application");
        System.out.println();


        ParkingSystem parkingsystem = new ParkingSystem(1, 1, 15);


        parkingsystem.getInfo();

        Car bmw = new Car();


        parkingsystem.addVehicle(1, 6, bmw);
        parkingsystem.getInfo();
        parkingsystem.removeVehicle(1, 6);
        parkingsystem.getInfo();

        System.out.println();
        LOG.info("Exiting application");


    }

}

