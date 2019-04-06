package com.fyb.basic.dataType;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: fang
 * @Date: 2019/3/7 17:47
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StringTest {

    @Test
    public static void testString(){
        String a="abc";
        String b="abc";
        String c =new String("abc");
        System.out.println(a==b);
        System.out.println(a==c);
    }


    @Test
    public void testString1(){
        String a="abc";
        String b="ab";
        b="cc";
        String c=b+"c";
        String d="ab"+"c";
        System.out.println(a==c);
        System.out.println(a==d);
        System.out.println(c==b);
    }

}
