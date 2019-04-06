package com.fyb.basic.design_mode.factory.static_factory;

/**
 * @Auther: fang
 * @Date: 2019/3/17 15:47
 * @Description:
 */
public class CreateFactory {

    public static IProduct create(String productName){
        if(productName.equals("A")){
            return new ProductA();
        }else if(productName.equals("B")) {
            return new ProductB();
        }
        return null;
    }
}
