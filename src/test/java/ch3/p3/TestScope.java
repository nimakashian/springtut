package ch3.p3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = ComponentScanConfig.class)
@ContextConfiguration(classes = ExplicitConfig.class)
public class TestScope {


        @Autowired
        ApplicationContext context;

        @Test
        public void single(){
            SinglePool p1=context.getBean(SinglePool.class);
            SinglePool p2=context.getBean(SinglePool.class);
            Assert.assertSame(p1,p2);
        }

        @Test
        public void prototype(){
            PrototypeConnection p1=context.getBean(PrototypeConnection.class);
            PrototypeConnection p2=context.getBean(PrototypeConnection.class);
            Assert.assertNotSame(p1,p2);
        }




}
