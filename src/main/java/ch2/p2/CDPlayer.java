package ch2.p2;

import ch2.p1.CompactDisk;
import ch2.p1.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisk disk;

    @Autowired
    public void setDisk(CompactDisk disk) {
        this.disk = disk;
    }




    public String play(){
        return disk.play();
    }
}
