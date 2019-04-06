package com.fyb.basic.thread.wait_notify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: fang
 * @Date: 2019/3/25 16:14
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class volatileTest {

    private static boolean flag=true;
    //volatile用于修饰一个变量，强调的是“立即”当对一个变量（共享变量）读取时，从主内存中读取，对一个变量进行assign操作时
    //立即刷新工作区域的值到主内存中，从而达到变量可见的目的
    /*
    * 注意：volatile读取数据只能保证，每次变量都是从主内存中读取，并不能保证该读取的数据就是此刻最新数据
    * 这是volatile不能保证对变量操作时原子性的。
    * */
    //对于非volatile修饰的变量，在assign操作之后，也会把工作内存的数据刷新到主内存中，但是可能存在一定的延迟
    //延迟是由于工作内存与主内存中进行数据交互不是原子性的，当对变量修改时，还没来的及将修改的值刷新到主内存中，
    //就会导致，变量值存在不同的状态
    //volatile特性：1.可见性2.禁止指令重排序优化
    @Test
    public void test1() throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (flag){
                    System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getState());
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                flag=false;
                System.out.println("结束了-----------------------------");
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        Thread.sleep(4000);
    }
}
