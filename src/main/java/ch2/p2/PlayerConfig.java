package ch2.p2;

import ch2.p1.CDPlayer;
import ch2.p1.CompactDisk;
import ch2.p1.Homayon;
import ch2.p1.MediaPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayerConfig {

    @Bean(name = "someMusicFromHomayon")
    CompactDisk homayon(){
        return new Homayon();
    }

    @Bean
    MediaPlayer cdPlayer(){
        return new CDPlayer(homayon());
    }
}
