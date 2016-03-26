package com.parksystem.model;

import com.sun.jmx.snmp.SnmpBadSecurityLevelException;

import java.lang.invoke.CallSite;
import java.util.Arrays;


public class Test {

    public static void main(String[] args) {

//Инициализируем парковку. Формат ввода: Количевство уровней, рядов, мест.
        ParkingSystem parkingsystem = new ParkingSystem(1, 1, 15);

        //Два мотоцикла(Номерной знак в качевстве аргумента)
        Motorcycle moto = new Motorcycle("21alexander");
        Motorcycle moto2 = new Motorcycle("ds");

        //Паркуем(Формат: Уровень, ряд, номер)
        parkingsystem.addVehicle(1, 1, 1, moto);

        //Паркуем в тоже место. Вот не задача, но место занято!
        parkingsystem.addVehicle(1, 1, 1, moto2);

        //Получаем инфо о парковке
        parkingsystem.getInfo();

        //Паркуем рядом(Формат: Уровень, ряд, номер)
        parkingsystem.addVehicle(1, 1, 2, moto2);

        //Снова инфо о парковке
        parkingsystem.getInfo();


    }


}
