package com.knight.templateMethod;

/**
 * @Author: knight
 * @Date: 2018/4/4 下午2:30
 */

public class Concrete extends TemplateClass{
    public void doSomeThing() {
        System.out.println("to do it!");
    }

    public static void main(String[] args) {
        Concrete concrete = new Concrete();
        concrete.doSomeThing();
        concrete.say();
    }
}
