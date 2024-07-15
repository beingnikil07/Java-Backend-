package com.example.beans;
import org.springframework.beans.factory.annotation.Autowired;
public class Vehicle {
    public Vehicle(){
        System.out.println("Vehicle bean created by Spring");
    }
    private String name="Toyota";

    @Autowired
    private  Person person;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String hello(){
        return "Hello from Vehicle Pojo class";
    }
    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
