package com.knight.factoryMethod;

/**
 * 创建产品的抽象工厂
 * @Author: knight
 * @Date: 2018/3/23 下午3:07
 */

public abstract class Creator {
    /**
     * 创建一个产品对象，其输入参数类型可以自行设置
     * 通常为String、Enum、Class等，当然也可以为空
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}
