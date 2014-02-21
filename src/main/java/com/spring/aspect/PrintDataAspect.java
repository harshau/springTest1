package com.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/** Print Data bean aspect
 * Created by harsh on 2/21/14.
 */


@Aspect
public class PrintDataAspect {

    @Before("execution(* com.spring.beans.PrintData.printName(..))")
    public void beforeMethodCall(JoinPoint point){
        System.out.println("Before Method call ");
    }


    @After("execution(* com.spring.beans.PrintData.printName(..))")
     public void afterMethodCall(JoinPoint point){
        System.out.println("After Method call "+point.getSignature().getName());
    }

    @AfterReturning(
            pointcut = "execution(* com.spring.beans.PrintData.printName(..))",
            returning = "obj"
            )
    public void afterRunningCall(JoinPoint point,Object obj){
        System.out.println("AfterReturning Method call "+obj.toString());
    }


}
