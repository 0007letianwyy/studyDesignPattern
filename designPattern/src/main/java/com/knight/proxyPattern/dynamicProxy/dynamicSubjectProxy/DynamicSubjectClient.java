package com.knight.proxyPattern.dynamicProxy.dynamicSubjectProxy;

import java.lang.reflect.InvocationHandler;

/**
 * @Author: knight
 * @Date: 2018/5/4 下午4:51
 */

public class DynamicSubjectClient {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler handler = new MyInvocationHander(subject);
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),handler);
        proxy.doSomethind("hello");
    }
}
