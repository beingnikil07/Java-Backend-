package com.example.config;
import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Vehicle vehicle(){
        Vehicle veh=new Vehicle();
        veh.setName("Audi");
        return  veh;
    }


    /*
    Here in the below code, we are trying to wire or establish a relationship between Person
    and Vehicle, by passing the vehicle as a method parameter to the person() bean method.

    Spring injects the vehicle bean to the person bean using Dependency Injection. Spring will
    make sure to have only 1 vehicle bean is created and also vehicle bean will be created
    first always as person bean has dependency on it.

    * */


    @Bean
    public Person person(Vehicle vehicle){
        Person p=new Person();
        p.setName("Nik");
        //wiring beans using method parameter
        p.setVehicle(vehicle);
        return  p;
    }

}
