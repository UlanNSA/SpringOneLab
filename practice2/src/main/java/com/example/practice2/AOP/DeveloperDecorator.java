package com.example.practice2.AOP;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class DeveloperDecorator  implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.print("So ");
        Object retVal = invocation.proceed();
        System.out.println("...");
        return retVal;
    }
}
