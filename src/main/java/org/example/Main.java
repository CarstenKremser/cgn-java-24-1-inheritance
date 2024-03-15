package org.example;

public class Main {


    public static void main(String[] args) {

        Vehicle myBike = new Vehicle("Peugeot", "27 Bike", 1990);
        Car myCar = new Car("BMW", "3 series", 2005, 5);
        Motorcycle myMotorcycle = new Motorcycle("Aprilia", "RS660", 2021,"Sportsbike");

        System.out.println(myBike);
        System.out.println(myCar);
        System.out.println(myMotorcycle);
    }
}