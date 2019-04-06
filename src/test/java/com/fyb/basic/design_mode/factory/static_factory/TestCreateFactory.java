package com.fyb.basic.design_mode.factory.static_factory;

/**
 * @Auther: fang
 * @Date: 2019/3/17 15:52
 * @Description:
 */
public class TestCreateFactory {
/*
* 静态工厂模式:创建对应产品的实例:
* 1.定义一个接口
* 2.对于具体产品(多个)实现这个接口
* 3.创建一个工厂类,提供静态方法,
* 参数:产品名称,
* 返回值:接口名称,
* 方法实现:根据传入的商品名称,创建对应的产品实例
* */
    public static void main(String[] args) {
        IProduct A = CreateFactory.create("A");
        A.create();
        IProduct B = CreateFactory.create("B");
        B.create();
    }
}
