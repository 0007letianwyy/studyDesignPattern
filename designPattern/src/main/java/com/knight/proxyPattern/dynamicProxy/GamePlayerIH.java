package com.knight.proxyPattern.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: knight
 * @Date: 2018/5/3 上午10:58
 */

public class GamePlayerIH implements InvocationHandler{
    //被代理者
    Class cls = null;
    //被代理的实例
    Object obj = null;
    //我要代理谁


    public GamePlayerIH(Object obj) {
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(this.obj,args);
        return result;
    }
}
