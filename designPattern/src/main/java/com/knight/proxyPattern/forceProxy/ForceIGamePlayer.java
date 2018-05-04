package com.knight.proxyPattern.forceProxy;

/**
 * @Author: knight
 * @Date: 2018/5/2 下午3:47
 */

public interface ForceIGamePlayer {
    public void login(String name,String password);
    public void killBoss();
    public void upgrade();
    //获取自己的代理
    public ForceIGamePlayer getProxy();
}
