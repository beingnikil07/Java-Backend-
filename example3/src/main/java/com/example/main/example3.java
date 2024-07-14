package com.example.main;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class example3 {

    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh1=context.getBean("toyota",Vehicle.class);
        System.out.println("Vehicle name from spring context is :"+veh1.getName());
        Vehicle veh2=context.getBean("audi",Vehicle.class);
        System.out.println("Vehicle name from spring context is :"+veh2.getName());
        Vehicle veh3=context.getBean("punch",Vehicle.class);
        System.out.println("Vehicle name from spring context is :"+veh3.getName());
    }
}
