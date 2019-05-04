package ch2.p2;

import ch2.p1.CompactDisk;
import ch2.p1.MediaPlayer;
import ch2.p2.PlayerConfig;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PlayerConfig.class)
public class PlayerTest {

    @Rule
    public final StandardOutputStreamLog log=new StandardOutputStreamLog();
    @Autowired
    MediaPlayer player;
    @Autowired
    CompactDisk disk;

    @Test
    public void notNull(){
        Assert.assertNotNull(disk);
    }

    @Test
    public void testPlay(){
        player.play();
//        System.out.println(log.getLog());
//        Assert.assertEquals("cd: Homayon-->mast o mastor\n",log.getLog());
        Assert.assertEquals("cd: Homayon-->mast o mastor" ,player.play());
    }

}
