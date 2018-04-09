package com.knight.templateMethod;

/**
 * @Author: knight
 * @Date: 2018/4/4 下午2:29
 */

public abstract class TemplateClass {
    public abstract void doSomeThing();
    //防止被恶意覆写
    public final void say(){
        System.out.println("hello");
    }
}
