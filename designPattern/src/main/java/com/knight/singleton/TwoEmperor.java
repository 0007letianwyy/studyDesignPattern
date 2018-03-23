package com.knight.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 产生固定数量的实例
 *
 *
 * 称为有上限的多例模式
 *
 * @Author: knight
 * @Date: 2018/3/23 上午11:01
 */

public class TwoEmperor {
    //先定义要产生的数量
    private static final int maxNum = 2;

    //私有化构造方法
    private TwoEmperor() {

    }

    //皇帝的名字的数组
    private static List<String> nameList = new ArrayList<String>();
    //要产生的实例存放在一个数组里
    private static List<TwoEmperor> emperorList = new ArrayList<TwoEmperor>();
    //先初始化一下当前的序号
    private static int currentNum = 0;

    //产生所有的对象
    static {
        for (int i = 0; i < maxNum; i++) {
            emperorList.add(new TwoEmperor("第" + (i + 1) + "皇帝"));
        }
    }

    private TwoEmperor(String name) {
        nameList.add(name);
    }

    //随机产生一个对象
    public static TwoEmperor getInstance() {
        Random random = new Random();
        currentNum = random.nextInt(maxNum);
        return emperorList.get(currentNum);
    }

    //给出个方法显示是哪个皇帝
    public static void say() {
        System.out.println(nameList.get(currentNum));
    }

}
