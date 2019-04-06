package com.fyb.basic.scale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: fang
 * @Date: 2019/3/6 15:11
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class testScale {

    @Test
    //二进制0b开头 b可以大写可以小写
    //八进制0开头
    //十进制 默认就是十进制
    //16进制 0x开头,既大小写都可以
    public void testScale(){
        System.out.println(0b10000100);
        System.out.println(0100);
        System.out.println(100);
        System.out.println(0x100);
    }
}
