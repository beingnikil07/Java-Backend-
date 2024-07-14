package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example14 {

    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person=context.getBean(Person.class);
        Vehicle vehicle=context.getBean(Vehicle.class);
        System.out.println("Person name from person class is :"+person.getName());
        System.out.println("Vehicle name from vehicle class is :"+vehicle.getName());
        System.out.println("Vehicle that Person own is :"+person.getVehicle());
        }

    }