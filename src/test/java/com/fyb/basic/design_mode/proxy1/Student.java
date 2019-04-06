package com.fyb.basic.design_mode.proxy1;

/**
 * @Auther: fang
 * @Date: 2019/3/18 10:07
 * @Description:
 */
public class Student implements Iperson {
    @Override
    public void eat() {
        System.out.println("好好吃饭才能长个");
    }

    @Override
    public void sleep(int time) {
        System.out.println("今天睡了"+time+"分钟");
    }
}
