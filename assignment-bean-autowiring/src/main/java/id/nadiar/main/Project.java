package id.nadiar.main;

import id.nadiar.beans.Person;
import id.nadiar.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Project {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person nadiar = context.getBean("personBean", Person.class);
        nadiar.setName("Nadiar");

        System.out.println(nadiar.getName());
        nadiar.getVehicle().setName("Tesla");
        System.out.println(nadiar.getVehicle().getName());
        nadiar.getVehicle().getVehicleService().getSpeaker().makeSound();
        nadiar.getVehicle().getVehicleService().getTyres().rotate();

        Person elon = context.getBean(Person.class);
        System.out.println(elon.getName());
    }
}
