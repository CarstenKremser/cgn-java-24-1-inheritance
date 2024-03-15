package org.example;

public class Car extends Vehicle {

    int numberOfDoors;


    public Car(String manufacturer, String model, int yearOfManufacture, int numberOfDoors) {
        super(manufacturer, model, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
    }
}
