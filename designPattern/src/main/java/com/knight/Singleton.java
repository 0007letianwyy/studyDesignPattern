package com.knight;

/**
 * 单例设计模式
 * @Author: knight
 * @Date: 2018/3/23 上午10:41
 */

public class Singleton {
    private static final Singleton s = new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){
        return s;
    }
}
