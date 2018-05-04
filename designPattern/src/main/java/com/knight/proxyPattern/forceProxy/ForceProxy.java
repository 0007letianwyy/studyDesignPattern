package com.knight.proxyPattern.forceProxy;

/**
 * @Author: knight
 * @Date: 2018/5/2 下午4:26
 */

public class ForceProxy implements ForceIGamePlayer{
    private ForceIGamePlayer gamePlayer = null;

    public ForceProxy(ForceIGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    public void login(String name, String password) {
        this.gamePlayer.login(name,password);
    }

    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    public ForceIGamePlayer getProxy() {
        return this;
    }
}
