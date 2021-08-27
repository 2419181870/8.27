package com.cdut.demo.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class CostTimeAspect {

    ThreadLocal<Long> startTime = new ThreadLocal<>();

    @Pointcut("execution(public * com.cdut.demo.controller.*.*(..))")
    private void pointcut() {}

    @Before("pointcut()")
    public void doBefore(JoinPoint joinPoint) throws Throwable{
        startTime.set(System.currentTimeMillis());
    }

    //和doBefore搭配，得到使用的时间
    @AfterReturning(returning = "ret" , pointcut = "pointcut()")
    public void doAfterReturning(Object ret){

        System.out.println("costTime aop 方法 doAfterReturning: 毫秒数:"+ (System.currentTimeMillis() - startTime.get()));
    }

}
