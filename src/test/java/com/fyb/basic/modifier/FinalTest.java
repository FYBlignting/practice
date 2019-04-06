package com.fyb.basic.modifier;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: fang
 * @Date: 2019/3/7 23:35
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class FinalTest {
    //final
    // 1.final修饰类,该类不可以不继承
    //2.final修饰方法,该方法不能被重写,如果父类私有了final的方法,在子类中是可以定义定义同样的方法,
    // 不属于重写方法,属于子类特有的方法
    //3.final修饰变量,该变量则视为常量,不能重新赋值
    //3.1 如果final变量为成员变量,要么给定初始值,要么在构造方法中赋值
    //3.2 如果该变量为局部变量,只要在使用之前,给定初始值即可
    @Test
    public void testFinal_01(){
       final FinalTest2 test1 = new FinalTest2("xiaoming");
       new FinalTest2("bb");
       //new FinalTest2("aa").setName("bb");
        System.out.println(test1);
        //test1.setName("aaa");
        System.out.println(test1);
    }
}
