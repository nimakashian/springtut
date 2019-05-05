package ch3.p2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@Conditional(MagicCondition.class)
public class MagicConfig {

    @Bean
    public MagicBean magicBean(){
        return new MagicBean();
    }
}
