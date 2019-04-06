package com.fyb.basic.thread.Exception;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: fang
 * @Date: 2019/3/24 21:53
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class IllegalMonitorStateException {

    //wait：
    //在使用wait之前，必须获取对象锁，否则会抛出IllegaMonitorStateException,
    //所以wait必须在同步方法或者同步代码块中使用
    @Test
    public void testIllegalMonitorStateException(){
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("使用wait方法");
                Object o = new Object();
                try {
                    o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
    }
}

