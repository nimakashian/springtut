package ch2.p1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PlayerConfig.class)
public class PlayerTest {

    @Autowired
    CompactDisk disk;

    @Test
    public void notNull(){
        Assert.assertNotNull(disk);
    }

}
