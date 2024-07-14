package com.example.beans;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    public Vehicle(){
        System.out.println("Vehicle bean created by Spring");
    }

    private String name="Toyota";

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
