package com.lingtao.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by lingtao on 2020/4/12 22:54
 * @description use annotation to found aop
 **/
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.lingtao.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("====before method has been executed");
    }

    @Around("execution(* com.lingtao.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        //执行方法
        Object proceed = joinPoint.proceed();
        System.out.println("环绕后");

    }
}
