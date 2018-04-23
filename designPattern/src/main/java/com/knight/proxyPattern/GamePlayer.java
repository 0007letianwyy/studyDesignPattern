package com.knight.proxyPattern;

/**
 * @Author: knight
 * @Date: 2018/4/11 下午5:14
 */

public class GamePlayer implements IGamePlayer {
    private String gamePlayerName = "";

    public GamePlayer(String gamePlayerName) {
        this.gamePlayerName = gamePlayerName;
    }

    public void login(String name, String password) {
        System.out.println("登录名为：" + name + "的用户 " + this.gamePlayerName + "登录成功");
    }

    public void killBoss() {
        System.out.println(this.gamePlayerName + "在打怪");
    }

    public void upgrade() {
        System.out.println(this.gamePlayerName + "又升了一级");
    }
}
