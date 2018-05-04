package com.knight.proxyPattern.dynamicProxy.dynamicSubjectProxy;

/**
 * @Author: knight
 * @Date: 2018/5/4 下午4:14
 */

public class RealSubject implements Subject{
    public void doSomethind(String str) {
        System.out.println("do something -->" + str);
    }
}
