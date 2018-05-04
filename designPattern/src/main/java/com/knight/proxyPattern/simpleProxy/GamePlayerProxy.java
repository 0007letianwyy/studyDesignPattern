package com.knight.proxyPattern.simpleProxy;

import com.knight.proxyPattern.IGamePlayer;

/**
 * @Author: knight
 * @Date: 2018/4/11 下午5:05
 */

public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer _gamePlayer) {
        this.gamePlayer = _gamePlayer;
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
