package com.knight.factoryMethod;

/**
 * 具体的工厂类
 * @Author: knight
 * @Date: 2018/3/23 下午3:10
 */

public class ConcreteCreator extends Creator{
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("生产异常"+e.getMessage());
        }

        return (T)product;
    }
}
