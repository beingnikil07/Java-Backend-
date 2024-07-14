package com.example.beans;

public class Person {

public Person(){
    System.out.println("Person bean created by Spring");
}
private  String name;
//creating the object of type Vehicle class for the purpose of wiring
private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
