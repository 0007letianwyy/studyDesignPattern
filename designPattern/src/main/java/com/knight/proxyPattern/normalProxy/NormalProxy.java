package com.knight.proxyPattern.normalProxy;

import com.knight.proxyPattern.IGamePlayer;

/**
 * @Author: knight
 * @Date: 2018/5/2 下午3:18
 */

public class NormalProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    public NormalProxy(String name) {
        try {
            gamePlayer = new NormalPlayer(this,name);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
}
