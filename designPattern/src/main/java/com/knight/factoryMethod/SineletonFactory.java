package com.knight.factoryMethod;

import java.lang.reflect.Constructor;

/**
 * 负责生产单例的工厂类
 * @Author: knight
 * @Date: 2018/3/26 下午5:12
 */

public class SineletonFactory {
    private static Singleton singleton;
    static {
        try {
            Class c = Class.forName(Singleton.class.getName());
            //获得无参构造
            Constructor constructor = c.getDeclaredConstructor();
            //设置无参构造是可访问的
            constructor.setAccessible(true);
            //产生一个实例对象
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Singleton singleton(){
        return singleton;
    }

}
