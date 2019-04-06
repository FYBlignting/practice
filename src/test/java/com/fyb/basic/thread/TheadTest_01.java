package com.fyb.basic.thread;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: fang
 * @Date: 2019/3/13 02:08
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TheadTest_01{
    @Test
    public void test01(){
        new Thread();
    }
}
