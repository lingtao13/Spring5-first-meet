package com.lingtao.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by lingtao on 2020/4/12 20:35
 **/

public class AfterLog implements AfterReturningAdvice {
    //returnValue: return value
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("execute "+method.getName()+" method, the returned result is: "+returnValue);
    }
}
