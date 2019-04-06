package com.fyb.basic.design_mode.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: fang
 * @Date: 2019/3/15 16:36
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MyProxyTest {
    @Test
    public void test1(){
        People people = new People();
        MyProxy myProxy = new MyProxy(people);
        BasicInterface basicInterface = myProxy.create();
        basicInterface.eat(30,"fish");
        basicInterface.sleep(30);
    }
}
