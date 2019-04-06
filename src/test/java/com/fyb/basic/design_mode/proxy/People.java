package com.fyb.basic.design_mode.proxy;

/**
 * @Auther: fang
 * @Date: 2019/3/15 16:01
 * @Description:
 */
public class People implements BasicInterface{
    @Override
    public void eat(int time,String food) {
        System.out.println("今天吃了"+food+"吃了"+time);
    }

    @Override
    public String sleep(int time) {
        return "今天睡了"+time+"分钟";
    }


}
