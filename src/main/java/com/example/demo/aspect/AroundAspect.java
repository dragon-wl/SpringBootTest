package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author wanglong
 * @time 2021/2/18/
 * @ref
 *
 * @Around可以实现@Before和@After的功能，并且只需要在一个方法中就可以实现。
 */
@Component
@Aspect
public class AroundAspect {
    @Around("execution(public * com.example.demo.controller.*.*(..))")
    public Object aroundMethod(ProceedingJoinPoint pdj){
        /*result为连接点的放回结果*/
        Object result = null;
        String methodName = pdj.getSignature().getName();

        /*前置通知方法*/
        System.out.println("前置通知方法>目标方法名：" + methodName + ",参数为：" + Arrays.asList(pdj.getArgs()));

        /*执行目标方法*/
        try {
            result = pdj.proceed();

            /*返回通知方法*/
            System.out.println("返回通知方法>目标方法名" + methodName + ",返回结果为：" + result);
        } catch (Throwable e) {
            /*异常通知方法*/
            System.out.println("异常通知方法>目标方法名" + methodName + ",异常为：" + e);
        }

        /*后置通知*/
        System.out.println("后置通知方法>目标方法名" + methodName);

        return result;
    }
}

