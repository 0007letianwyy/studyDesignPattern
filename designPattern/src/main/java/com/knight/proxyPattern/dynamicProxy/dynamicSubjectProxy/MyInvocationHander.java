package com.knight.proxyPattern.dynamicProxy.dynamicSubjectProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: knight
 * @Date: 2018/5/4 下午4:15
 */

public class MyInvocationHander implements InvocationHandler{
    private Object target = null;

    public MyInvocationHander(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.target,args);
    }
}
