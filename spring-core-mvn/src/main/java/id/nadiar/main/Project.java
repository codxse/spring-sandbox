package id.nadiar.main;

import id.nadiar.beans.MotorCycle;
import id.nadiar.beans.Vehicle;
import id.nadiar.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Project {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Brio");
        System.out.println("From non spring Context is: " + vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean("toyota", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());

        Vehicle suzuki = context.getBean("suzuki", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + suzuki.getName());

        Vehicle defaultVehicle = context.getBean(Vehicle.class);
        System.out.println("Default vehicle name from Spring Context is " + defaultVehicle.getName());

        String hello = context.getBean(String.class);
        System.out.println("String value from Spring Context is: " + hello);

        Integer num = context.getBean(Integer.class);
        System.out.println("Integer value from Spring Context is: " + num);

        MotorCycle motorCycle = context.getBean((MotorCycle.class));
        motorCycle.sayHello();
    }
}
