package ch4.p1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "ch4.p1")
public class AspectConfig {

    @Bean
    public Audience audience(){
        return new Audience();
    }


}
