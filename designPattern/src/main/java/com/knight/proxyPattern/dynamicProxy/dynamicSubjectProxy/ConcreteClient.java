package com.knight.proxyPattern.dynamicProxy.dynamicSubjectProxy;

/**
 * @Author: knight
 * @Date: 2018/5/4 下午5:29
 */

public class ConcreteClient {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxy = ConcreteDynamicProxy.newProxyInstance(subject);
        proxy.doSomethind("hello");

    }
}
