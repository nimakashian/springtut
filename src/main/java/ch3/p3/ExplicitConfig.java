package ch3.p3;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class ExplicitConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PrototypeConnection prototypeConnection(){
        return new PrototypeConnection();
    }

    @Bean
    public SinglePool singlePool(){
        return new SinglePool();
    }
}
