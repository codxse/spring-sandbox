package id.nadiar.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Processor {
    private String name;

    public String getName() {
        return name;
    }

    @PostConstruct
    private void setDefaultName() {
        name = "M2";
    }
}
