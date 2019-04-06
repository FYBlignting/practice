package com.fyb.basic.design_mode.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: fang
 * @Date: 2019/3/15 16:07
 * @Description:
 */
public class MyProxy {
    private BasicInterface basicInterface;

    public MyProxy(BasicInterface basicInterface) {
        this.basicInterface = basicInterface;
    }

    public BasicInterface create() {
       return (BasicInterface)Proxy.newProxyInstance(basicInterface.getClass().getClassLoader(),new Class[]{BasicInterface.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("eat")) {
                    if("fish".equals(args[1])){
                        System.out.println("吃鱼得小心");

                    }
                }
                if (method.getName().equals("sleep")) {
                    System.out.println("睡觉前");
                    System.out.println("睡觉后");
                }
                method.invoke(basicInterface,args);
                return null;
            }
        });
    }
}
