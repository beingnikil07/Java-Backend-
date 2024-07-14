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
    Here in the below code, we are trying to wire or establish a relationship between Person and
    Vehicle, by invoking the vehicle() bean method from person() bean method.

    Spring will make sure to have only 1 vehicle bean is created and also vehicle bean will
    be created first always as person bean has dependency on it.

    Bean to Vehicle kii only 1 banegi by the spring framework chahe kitni he baar call kyu na karle hum vehicle() method ko
    * */


    @Bean
    public Person person(){
        Person p=new Person();
        p.setName("Nik");
        //wiring beans using method call
        p.setVehicle(vehicle());
        return  p;
    }

}
