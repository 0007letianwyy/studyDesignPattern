package com.knight.factoryMethod;

/**
 * @Author: knight
 * @Date: 2018/3/23 下午3:13
 */

public class FactoryTest {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        product.method2();
    }
}
