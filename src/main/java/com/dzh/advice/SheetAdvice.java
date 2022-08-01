package com.dzh.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Auther: Hello Baby
 * @Date: 2022/8/1
 * @Descriptin: ssm_music
 * @version: 1.0
 */
public class SheetAdvice {
    /**
     * 前置通知
     */
    public void before() {
        System.out.println("前置通知");
    }

    /**
     * 后置通知
     */
    public void after() {
        System.out.println("最终的后置通知，异常与否都会执行");
    }

    /**
     * 后置通知2
     */
    public void after_returning() {
        System.out.println("后置通知，发生异常不会被执行");
    }

    /**
     * 异常通知
     */
    public void after_throwing() {
        System.out.println("出现异常 (异常通知,发生异常时候执行)");
    }

    /**
     *异常通知
     */
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("环绕通知前");
        proceedingJoinPoint.proceed();
        System.out.println("环绕通知后");
    }
}
