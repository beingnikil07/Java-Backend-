package com.example.main;

import com.example.beans.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example8 {

    public static void main(String[] args) {

        // it will automatically fetch the configuration (class path)
        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle veh=context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is :"+veh.getName());
        }

    }