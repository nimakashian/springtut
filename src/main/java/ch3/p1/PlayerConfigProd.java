package ch3.p1;

import ch2.p1.CDPlayer;
import ch2.p1.CompactDisk;
import ch2.p1.Homayon;
import ch2.p1.MediaPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile( "prod")
public class PlayerConfigProd {

    @Bean(name = "prodbean1")
    CompactDisk homayon(){
        return new Homayon();
    }

    @Bean(name = "prodbean2")
    MediaPlayer cdPlayer(){
        return new CDPlayer(homayon());
    }
}
