package ch3.p2;

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
//@ContextConfiguration(classes = ComponentScanConfig.class)
@ContextConfiguration(classes = MagicConfig.class)
public class TestCondition {


        @Autowired
        ApplicationContext context;

        @Test
        public void condition(){
            System.out.println(context.containsBean("magicBean"));
        }






}
