package com.example.main;

import com.example.config.ProjectConfig;
import com.example.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example19 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices v1=context.getBean(VehicleServices.class);
        VehicleServices v2=context.getBean("vehicleServices",VehicleServices.class);
        System.out.println("Hashcode of the object v1:"+v1.hashCode());
        System.out.println("Hashcode of the object v2:"+v2.hashCode());
        if(v1==v2){
            System.out.println("VehicleServices bean is a singleton scoped bean");
        }
        else{
            System.out.println("VehicleServices bean is a prototype scoped bean");
        }
    }
}