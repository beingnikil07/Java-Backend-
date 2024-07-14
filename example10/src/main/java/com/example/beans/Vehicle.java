package com.example.beans;
import org.springframework.stereotype.Component;

public class Vehicle {

    private String name;
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
