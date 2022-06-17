package id.nadiar.config;

import id.nadiar.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "id.nadiar.beans")
public class ProjectConfig {

    @Primary
    @Bean(name="honda")
    Vehicle defaultBean() {
        var honda = new Vehicle();
        honda.setName("Honda");
        return honda;
    }

    @Bean(name="toyota")
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("Toyota");
        return veh;
    }

    @Bean
    Vehicle suzuki() {
        Vehicle suz = new Vehicle();
        suz.setName("Suzuki");
        return suz;
    }

    @Bean(name="helloWorld")
    String hello() {
        return "Hello world!";
    }

    @Bean
    Integer number() {
        return 22;
    }
}
