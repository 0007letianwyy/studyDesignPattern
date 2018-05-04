package com.knight.proxyPattern.normalProxy;

import com.knight.proxyPattern.IGamePlayer;

/**
 * @Author: knight
 * @Date: 2018/5/2 下午3:20
 */

public class NormalPlayer implements IGamePlayer {
    private String name = "";

    public NormalPlayer(IGamePlayer gamePlayer,String name) throws Exception{
        if(gamePlayer == null){
            throw new Exception("不能创建真实对象");
        }
        this.name = name;
    }
    public void login(String name, String password) {
        System.out.println("登录名为：" + name + "的用户 " + this.name + "登录成功");
    }

    public void killBoss() {
        System.out.println(this.name + "在打怪");
    }

    public void upgrade() {
        System.out.println(this.name + "升级了");
    }
}
