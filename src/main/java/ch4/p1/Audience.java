package ch4.p1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    @Pointcut("execution(* ch4.p1.Performance.perform(..))")
    public void perfPointcut(){}

    @Before("execution(* ch4.p1.Performance.perform(..))")
    public void silenceCellPhone(){
        System.out.println("silencing cell phones");
    }

    @Before("perfPointcut()")
    public void takeSeats(){
        System.out.println("taking seats");
    }

    @AfterReturning("perfPointcut()")
    public void applause(){
        System.out.println("clap clap clap!");
    }

    @AfterThrowing("perfPointcut()")
    public void demandRefaund(){
        System.out.println("demanding a refaund");
    }

//    @Around("perfPointcut()")
//    public void aroundPerform(ProceedingJoinPoint jp){
//        try {
//            System.out.println("before perform");
//            jp.proceed();
//            System.out.println("after perform");
//
//        } catch (Throwable throwable) {
//            System.out.println("esception perform");
//        }
//
//    }
}
