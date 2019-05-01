package ch1.p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryMain {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("library.xml");

//        ApplicationContext context=new AnnotationConfigApplicationContext(LibraryConfiguration.class);

        Library library=context.getBean(Library.class);
        library.find();
        library.request();


    }
}
