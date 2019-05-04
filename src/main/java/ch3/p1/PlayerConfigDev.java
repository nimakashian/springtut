package ch3.p1;

import ch2.p1.CDPlayer;
import ch2.p1.CompactDisk;
import ch2.p1.Homayon;
import ch2.p1.MediaPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile( "dev")
public class PlayerConfigDev {

    @Bean(name = "devbean1")
    CompactDisk homayon(){
        System.out.println("devbean1");
        return new Homayon();
    }

    @Bean(name = "devbean2")
    MediaPlayer cdPlayer(){
        System.out.println("devbean2");
        return new CDPlayer(homayon());
    }
}
