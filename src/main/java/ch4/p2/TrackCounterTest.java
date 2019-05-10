package ch4.p2;


import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TrackCounterTest {

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(TrackCounterConfig.class);

        CompactDisk compactDisk=context.getBean(CompactDisk.class);
        TrackCounterAspect trackCounterAspect=context.getBean(TrackCounterAspect.class);


        compactDisk.playTrack(1);
        compactDisk.playTrack(1);
        compactDisk.playTrack(2);
        compactDisk.playTrack(2);
        compactDisk.playTrack(2);
        compactDisk.playTrack(4);
        compactDisk.playTrack(5);
        compactDisk.playTrack(5);
        compactDisk.playTrack(5);
        compactDisk.playTrack(5);


        System.out.println(trackCounterAspect.getPlayCount(1));
        System.out.println(trackCounterAspect.getPlayCount(2));
        System.out.println(trackCounterAspect.getPlayCount(4));
        System.out.println(trackCounterAspect.getPlayCount(5));
    }
}
