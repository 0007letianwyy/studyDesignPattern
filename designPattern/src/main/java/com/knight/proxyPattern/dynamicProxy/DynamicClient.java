package com.knight.proxyPattern.dynamicProxy;

import com.knight.proxyPattern.IGamePlayer;
import com.knight.proxyPattern.simpleProxy.GamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author: knight
 * @Date: 2018/5/3 下午3:23
 */

public class DynamicClient {
    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayerIH(gamePlayer);
        ClassLoader classLoader = gamePlayer.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(classLoader,new Class[]{IGamePlayer.class},handler);
        proxy.login("zs","123");
        proxy.killBoss();
        proxy.upgrade();
    }
}
