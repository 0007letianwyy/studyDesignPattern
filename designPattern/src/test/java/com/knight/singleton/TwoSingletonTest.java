package com.knight.singleton;

/**
 * @Author: knight
 * @Date: 2018/3/23 上午11:25
 */

public class TwoSingletonTest {
    public static void main(String[] args) {
        TwoEmperor emperor = TwoEmperor.getInstance();
        emperor.say();
    }
}
