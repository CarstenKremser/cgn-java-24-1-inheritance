package org.example;

public class Motorcycle extends Vehicle {

    String category;


    public Motorcycle(String manufacturer, String model, int yearOfManufacture, String category) {
        super(manufacturer, model, yearOfManufacture);
        this.category = category;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "super:(" +
                super.toString() +
                ") " +
                "category='" + category + '\'' +
                '}';
    }
}
