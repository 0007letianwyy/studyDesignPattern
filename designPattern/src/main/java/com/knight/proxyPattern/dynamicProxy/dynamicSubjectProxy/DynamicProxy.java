package com.knight.proxyPattern.dynamicProxy.dynamicSubjectProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author: knight
 * @Date: 2018/5/4 下午4:44
 */

public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler h){
        if(true){
            (new BeforeAdvice()).exec();
        }
        return (T) Proxy.newProxyInstance(classLoader,interfaces,h);
    }
}