package ch4.p2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

    @Bean
    public TrackCounterAspect trackCounterAspect(){
        return new TrackCounterAspect();
    }

    @Bean
    public CompactDisk disk(){
        BlankCompDisk blankCompDisk=  new BlankCompDisk();
        blankCompDisk.setArtist("mori");
        blankCompDisk.setArtist("spring is play songs");
        List<String> songs=new ArrayList<>();
        songs.add("mori 0");
        songs.add("mori 1");
        songs.add("mori 2");
        songs.add("mori 3");
        songs.add("mori 4");
        songs.add("mori 5");
        songs.add("mori 6");
        songs.add("mori 7");
        songs.add("mori 8");
        blankCompDisk.setSongs(songs);


        return blankCompDisk;
    }

}
