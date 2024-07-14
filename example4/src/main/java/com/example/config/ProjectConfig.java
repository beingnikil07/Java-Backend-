package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
* */

@Configuration
public class ProjectConfig {

   @Bean(name="toyota")
    Vehicle vehicle1(){

       var veh=new Vehicle();
       veh.setName("Toyota");
       return  veh;
    }
    @Bean(value="audi")
    Vehicle vehicle2(){
        var veh=new Vehicle();
        veh.setName("audi");
        return  veh;
    }


    @Primary               //indicates this will be the default bean
    @Bean("punch")
    Vehicle vehicle3(){
        var veh=new Vehicle();
        veh.setName("punch");
        return  veh;
    }

}
