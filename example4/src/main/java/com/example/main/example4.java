package com.example.main;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class example4 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);   //Not specifying the bean name
        // you will get Ferrari as a default bean because of @primary
        System.out.println("Component vehicle name from the spring context is :" + veh.getName());
    }
}
