package testsingleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AspectConfig.class);

//        SingletonBean singletonBean=context.getBean(SingletonBean.class);
//        SingletonBean singletonBean1=context.getBean(SingletonBean.class);

        ProtBean protBean=context.getBean(ProtBean.class);
        ProtBean protBean1=context.getBean(ProtBean.class);
        System.out.println("sdfsdf");

    }
}
