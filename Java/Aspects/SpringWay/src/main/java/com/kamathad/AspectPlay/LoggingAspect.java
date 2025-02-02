package com.kamathad.AspectPlay;

import org.springframework.stereotype.Component;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.kamathad.AspectPlay.*.*(..))")
    public void beforeMethod(){
        System.out.println("sayHello is now running");
    }
}
