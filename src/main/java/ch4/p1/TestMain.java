package ch4.p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AspectConfig.class);

        Performance performance= (Performance) context.getBean(Performance.class);

        performance.perform();
        System.out.println("sdfsdf");

    }
}
