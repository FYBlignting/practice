package com.fyb.basic.design_mode.factory.static_factory;

import java.util.ArrayList;

/**
 * @Auther: fang
 * @Date: 2019/3/17 15:47
 * @Description:
 */
public class ProductA implements IProduct{

    public void create(){
        System.out.println("我是产品A");
        ArrayList<String> strings = new ArrayList<>();
    }
}
