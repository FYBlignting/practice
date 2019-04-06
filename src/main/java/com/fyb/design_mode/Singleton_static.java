package com.fyb.design_mode;

/**
 * @Auther: fang
 * @Date: 2019/3/8 16:25
 * @Description:
 */
//最安全的单例模式
public class Singleton_static {
    private Singleton_static(){}

    public static Singleton_static getSingleton_static(){
        return SingletonInstance.instance;
    }

    private static class SingletonInstance{
        private static Singleton_static instance=new Singleton_static();
    }
}
