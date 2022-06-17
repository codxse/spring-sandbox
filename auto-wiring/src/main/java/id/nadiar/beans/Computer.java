package id.nadiar.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class Computer {
    private String name;
    private Processor cpu;

    @Autowired
    public Computer(Processor processor) {
        cpu = processor;
        System.out.println("Computer has been created by Spring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Processor getCpu() {
        return cpu;
    }

    @PostConstruct
    private void setDefaultName() {
        this.name = "Macbook Pro";
    }
}
