package id.nadiar.config;

import id.nadiar.beans.Person;
import id.nadiar.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "id.nadiar.beans")
public class ProjectConfig {
    @Primary
    @Bean
    public Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Tesla");
        return vehicle;
    }
    public Vehicle toyota() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }
    @Primary
    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("Nadiar");
        person.setVehicle(toyota());
        return person;
    }
    @Bean(name="Elon")
    public Person otherPerson(Vehicle vehicle) {
        Person person = new Person();
        person.setName("Elon");
        person.setVehicle(vehicle);
        return person;
    }
}