package com.knight.proxyPattern.dynamicProxy.dynamicSubjectProxy;

/**
 * @Author: knight
 * @Date: 2018/5/4 下午4:48
 */

public class BeforeAdvice implements IAdvice{
    public void exec() {
        System.out.println("这是前置通知，被执行了");
    }
}
