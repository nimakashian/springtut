package ch3.p4;

import ch3.p3.ExplicitConfig;
import ch3.p3.PrototypeConnection;
import ch3.p3.SinglePool;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BasicPropConfig.class)
public class TestEvn {


        @Autowired
        ApplicationContext context;
        @Autowired
        BlankCompDisk disk;

        @Test
        public void basic(){
            System.out.println(disk.getArtist());
            System.out.println(disk.getTitle());
        }




}
