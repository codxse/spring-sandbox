package id.nadiar.config;

import id.nadiar.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages="id.nadiar.beans")
public class ProjectConfig {
    @Bean
    public SonySpeaker sonySpeaker() {
        return new SonySpeaker();
    }
    @Primary
    @Bean
    public Speaker baseSpeaker() {
        return new Speaker();
    }
    @Primary
    @Bean
    public BridgeStoneTyres bridgeStoneTyres() {
        return new BridgeStoneTyres();
    }
    @Bean
    public MichelinTyres michelinTyres() {
        return new MichelinTyres();
    }
}
