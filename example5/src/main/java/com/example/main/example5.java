package com.example.main;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class example5 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle=context.getBean(Vehicle.class);
        System.out.println("Component vehicle name from the spring context is:"+vehicle.getName()); //got null
        vehicle.hello();

    }
}
