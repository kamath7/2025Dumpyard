package org.kamathad;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class LoggingAspect {

    @Before("execution(* HelloService.sayHellp(..))")
    public void logBefore(){
        System.out.println("Logging: Method sayHello() will be executed");
    }
}
