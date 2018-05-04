package com.knight.proxyPattern.simpleProxy;

import com.knight.proxyPattern.IGamePlayer;

/**
 * @Author: knight
 * @Date: 2018/4/11 下午5:09
 */

public class Client {
    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("张三");
        IGamePlayer gamePlayerProxy = new GamePlayerProxy(gamePlayer);
        gamePlayerProxy.login("zhangsan","123");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();
    }
}
