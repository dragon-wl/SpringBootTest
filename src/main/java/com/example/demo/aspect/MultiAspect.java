package com.example.demo.aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author wanglong
 * @time 2021/2/18/
 * @ref
 *
 * 1、不同的切面类的执行顺序可以使用@Order(1)来确定，数字越小，越先执行
 */
@Aspect
@Component
@Slf4j
public class MultiAspect {
    @Pointcut("execution(public * com.example.demo.controller.Seller*.*(..))")
    public void verifySeller() {
    }

    @Pointcut("execution(public * com.example.demo.controller..*.*(..))")
    public void verifyAllControllerFunc() {

    }

    @Pointcut("execution(public * com.example.demo.controller.*.*(..))")
    public void verifyUser() {
    }

    @Pointcut("execution( * call*(..))")
    public void verifyAllCallFunc() {
    }

    //所有方法都会被拦截，会导致SpringBoot项目启动失败
//    @Pointcut("execution(public * * (..))")
//    public void verifyAnyPublic(){
//
//    }

    @Before("execution(public * com.example.demo.controller.*.*(..))")
    public void print(){
        log.info("---- AOP 01 ｜ Before | 拦截Controller包下所有类中的所有方法(不含子包)----");
    }

    @Before("verifyAllControllerFunc()")
    public void printAllControllerFunc(){
        log.info("---- AOP 02 ｜ Before | 拦截Controller包下所有类中的所有方法(含子包)----");
    }

    @Before("verifySeller()")
    public void printLine(){
        log.info("--- AOP 03｜ Before | 拦截Seller类中的方法----");
    }

    @Before("verifyAllCallFunc()")
    public void printAllCallFunc(){
        log.info("--- AOP 04｜ Before | 拦截以call开头的任意方法----");
    }

//    @Before("verifyAnyPublic()")
//    public void printAnyPublic(){
//        log.info("---AOP | 拦截任意公共方法 ----");
//    }

    @After("verifyUser()")
    public void printAfter(){
        log.info("---- AOP 05｜ After | 拦截Controller包下所有类中的所有方法(不含子包)----");
    }

    @After("verifyAllControllerFunc()")
    public void printAllControllerFuncAfter(){
        log.info("---- AOP 06｜ After | 拦截Controller包下所有类中的所有方法(含子包)----");
    }

    @After("verifySeller()")
    public void printLineAfter(){
        log.info("--- AOP 07｜ After | 拦截Seller类中的方法----");
    }

//    @After("verifyAllCallFunc()")
//    public void printAllCallFuncAfter(){
//        log.info("--- AOP 08｜ After | 拦截以call开头的任意方法----");
//    }


//    @Around("verifyUser()")
//    public Object printAround(ProceedingJoinPoint pjp){
//        log.info("---- AOP ｜ Around 09 | 拦截Controller包下所有类中的所有方法(不含子包)----");
//        return null;
//    }
//
//    @Around("verifyAllControllerFunc()")
//    public Object printAllControllerFuncAround(){
//        log.info("---- AOP ｜ Around 10 | 拦截Controller包下所有类中的所有方法(含子包)----");
//        return null;
//    }
//
//    @Around("verifySeller()")
//    public Object printLineAround(){
//        log.info("--- AOP ｜ Around 11 | 拦截Seller类中的方法----");
//        return null;
//    }
//
//    @Around("verifyAllCallFunc()")
//    public Object printAllCallFuncAround(){
//        log.info("--- AOP ｜ Around 12 | 拦截以call开头的任意方法----");
//        return null;
//    }
}
