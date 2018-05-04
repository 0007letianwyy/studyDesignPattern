package com.knight.proxyPattern.dynamicProxy.dynamicSubjectProxy;

import java.lang.reflect.InvocationHandler;

/**
 * @Author: knight
 * @Date: 2018/5/4 下午5:26
 */

public class ConcreteDynamicProxy extends DynamicProxy{
    public static <T> T newProxyInstance(Subject subject){
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class<?>[] classes = subject.getClass().getInterfaces();
        InvocationHandler handler = new MyInvocationHander(subject);
        return newProxyInstance(classLoader,classes,handler);
    }
}
