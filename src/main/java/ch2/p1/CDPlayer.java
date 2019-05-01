package ch2.p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisk disk;

    @Autowired
    public CDPlayer(CompactDisk disk) {
        this.disk = disk;
    }

    public String play(){
        return disk.play();
    }
}
