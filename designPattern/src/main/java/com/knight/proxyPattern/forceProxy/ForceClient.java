package com.knight.proxyPattern.forceProxy;

/**
 * @Author: knight
 * @Date: 2018/5/2 下午5:15
 */

public class ForceClient {
    public static void main(String[] args) {
        ForceIGamePlayer gamePlayer = new ForcePlayer("张三");
        ForceIGamePlayer proxy = gamePlayer.getProxy();
        proxy.login("zhangsan","q123");
        proxy.killBoss();
        proxy.upgrade();
    }

}
