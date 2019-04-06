package com.fyb.design_mode;

/**
 * @Auther: fang
 * @Date: 2019/3/8 16:19
 * @Description:
 */
//单例模式双重锁
public class Singleton_doubleSynchronized {
    private static Singleton_doubleSynchronized singleton_double;

    private Singleton_doubleSynchronized(){};

    public static Singleton_doubleSynchronized getSingleton_double(){
        if(singleton_double==null){
            synchronized (Singleton_doubleSynchronized.class){
                if(singleton_double==null){
                    singleton_double=new Singleton_doubleSynchronized();
                }
            }
        }
        return singleton_double;
    }
}
