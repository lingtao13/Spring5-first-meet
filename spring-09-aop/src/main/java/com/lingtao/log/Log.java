package com.lingtao.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by lingtao on 2020/4/12 20:32
 **/
public class Log implements MethodBeforeAdvice {
    // method: 要执行的目标对象的方法
    // args:参数
    // target 目标对象
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"'s "+method.getName()+" is being used ");
    }
}
