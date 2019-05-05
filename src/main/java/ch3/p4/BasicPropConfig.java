package ch3.p4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

@Configuration
@PropertySource("app.properties")
public class BasicPropConfig {

    @Autowired
    Environment env;

    @Bean
    public BlankCompDisk blankCompDisk(){
        return new BlankCompDisk(env.getProperty("disc.title"),
                env.getProperty("disc.artist"));
    }
}
