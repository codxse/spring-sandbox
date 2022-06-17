package id.nadiar.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Machine {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    private void setDefaultMachine() {
        name = "V8";
    }
}
