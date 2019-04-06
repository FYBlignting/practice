package com.fyb.basic.design_mode.proxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: fang
 * @Date: 2019/3/18 10:09
 * @Description:
 */
public class StudentProxy implements InvocationHandler {

    private Iperson iperson;

    public StudentProxy(Iperson iperson){
        this.iperson=iperson;
    }

  /*  public Iperson createProxy(){
        Proxy.newProxyInstance(iperson.getClass().getClassLoader(),new Class[]{iperson.getClass().getInterfaces()})
    }*/

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return null;
    }
}
