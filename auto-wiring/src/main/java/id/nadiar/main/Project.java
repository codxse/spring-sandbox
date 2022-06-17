package id.nadiar.main;

import id.nadiar.beans.Person;
import id.nadiar.beans.Vehicle;
import id.nadiar.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Project {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        Person elon = context.getBean("Elon", Person.class);

        System.out.println("Person name from Context is: " + person.getName());
        System.out.println("Vehicle name from Context is: " + vehicle + " " + vehicle.getName() + " with " + vehicle.getMachine().getName());
        System.out.println("Person's vehicle is: " + person.getVehicle() + " " + person.getVehicle().getName());
        System.out.println("Other person name is: " + elon.getName() + " and his car is " + elon.getVehicle() + " " + elon.getVehicle().getName());
        System.out.println("Person computer's is: " + person.getComputer() + " " + person.getComputer().getName() + " cpu " + person.getComputer().getCpu().getName());
        System.out.println(elon.getComputer() + " computer's is: " + elon.getComputer() + " " + elon.getComputer().getName());
    }
}
