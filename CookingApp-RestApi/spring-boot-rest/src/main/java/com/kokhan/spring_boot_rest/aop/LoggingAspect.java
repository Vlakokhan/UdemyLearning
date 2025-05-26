package com.kokhan.spring_boot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {


    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
    // return type  class-name . method-name(args)       - we  write in (execution)
    //It's advice and expression in brackets

    @Before("execution(* com.kokhan.spring_boot_rest.service.DishService.getDish(..)) || execution(* com.kokhan.spring_boot_rest.service.DishService.getAllDish(..)) ")
    public void logMethodCall(JoinPoint jp) {
        LOGGER.info("Method called " + jp.getSignature().getName());
    }

    @After("execution(* com.kokhan.spring_boot_rest.service.DishService.getDish(..)) || execution(* com.kokhan.spring_boot_rest.service.DishService.getAllDish(..)) ")
    public void logMethodExecuted(JoinPoint jp) {
        LOGGER.info("Method executed " + jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.kokhan.spring_boot_rest.service.DishService.getDish(..)) || execution(* com.kokhan.spring_boot_rest.service.DishService.getAllDish(..)) ")
    public void logMethodCrash(JoinPoint jp) {
        LOGGER.info("Method has some issues " + jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.kokhan.spring_boot_rest.service.DishService.getDish(..)) || execution(* com.kokhan.spring_boot_rest.service.DishService.getAllDish(..)) ")
    public void logMethodExecutedSuccess(JoinPoint jp) {
        LOGGER.info("Method executed succsessfully " + jp.getSignature().getName());
    }
}
