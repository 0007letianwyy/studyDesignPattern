package com.knight.proxyPattern.forceProxy;

/**
 * @Author: knight
 * @Date: 2018/5/2 下午4:09
 */

public class ForcePlayer implements ForceIGamePlayer{
    private String name = "";
    private ForceIGamePlayer gamePlayer = null;

    public ForcePlayer(String name) {
        this.name = name;
    }

    public void login(String name, String password) {
        if(isProxy()){
            System.out.println("登录名为：" + name + "的用户 " + this.name + "登录成功");
        }else {
            System.out.println("请使用指定代理访问");
        }

    }

    public void killBoss() {
        if(isProxy()){
            System.out.println(this.name + "在杀怪");
        }else {
            System.out.println("请使用指定代理访问");
        }

    }

    public void upgrade() {
        if(isProxy()){
            System.out.println(this.name + "升级了");
        }else {
            System.out.println("请使用指定代理访问");
        }

    }

    public ForceIGamePlayer getProxy() {
        this.gamePlayer = new ForceProxy(this);
        return this.gamePlayer;
    }
    private boolean isProxy(){
        if(this.gamePlayer == null){
            return false;
        }
        return true;
    }
}
