package com.knight.factoryMethod;

/**
 * 抽象的产品类
 * @Author: knight
 * @Date: 2018/3/23 下午3:03
 */

public abstract class Product {
    //产品类的公共方法
    public void method1(){
        //业务逻辑处理
        System.out.println("进入产品类了");
    }
    //各自不一样的处理
    public abstract void method2();
}
