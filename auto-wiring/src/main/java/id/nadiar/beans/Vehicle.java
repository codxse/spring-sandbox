package id.nadiar.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {
    private String name;
    private Machine machine;

    public Vehicle() {
        System.out.println("New Vehicle has been created by Spring");
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Machine getMachine() {
        return machine;
    }

    @Autowired
    private void setMachine(Machine machine) {
        this.machine = machine;
    }
}
