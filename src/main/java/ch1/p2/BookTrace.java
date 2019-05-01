package ch1.p2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.io.PrintStream;

@Aspect
public class BookTrace {

    PrintStream pt;

    public BookTrace(PrintStream pt) {
        this.pt = pt;
    }

    @Before("execution(* *.request(..))")
    public void bookEntered(){
        pt.println("the book entered");
    }
    @After("execution(* *.request(..))")
    public void bookExited(){
        pt.println("the book exited");
    }





}
