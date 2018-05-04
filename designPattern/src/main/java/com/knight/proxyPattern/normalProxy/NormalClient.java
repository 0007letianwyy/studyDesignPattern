package com.knight.proxyPattern.normalProxy;

/**
 * @Author: knight
 * @Date: 2018/5/2 下午3:25
 */

public class NormalClient {
    public static void main(String[] args) {
        NormalProxy proxy = new NormalProxy("张三");
        proxy.login("zs","123");
        proxy.killBoss();
        proxy.upgrade();
    }

}
