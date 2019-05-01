package ch1.p1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibraryConfiguration {

    @Bean
    public Library library(){
        return new Library(print());
    }
    @Bean
    public Print print(){
        return new Book(System.out);
    }


}
