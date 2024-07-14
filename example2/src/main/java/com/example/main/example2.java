package com.example.main;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class example2 {

    public static void main(String[] args) {

      //creating the spring context
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh=context.getBean("vehicle1",Vehicle.class);   //specifying the bean name which we want to fetch
        System.out.println("Vehicle name from spring context is :"+veh.getName());

    }
}
