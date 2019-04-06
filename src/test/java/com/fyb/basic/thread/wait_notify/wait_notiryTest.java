package com.fyb.basic.thread.wait_notify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther: fang
 * @Date: 2019/3/24 22:11
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class wait_notiryTest {
    /*
    * wait()时当前线程进入立即等待状态，失去CPU的执行资格，释放对象锁，在同步方法或者同步代码块中使用
    * notify()随机唤醒一个wait中的线程,notify，在同步方法或者同步代码块中使用
    * */
    @Test
    public void test1(){
        Object o = new Object();

        Thread t1= new  Thread(new Runnable() {
           @Override
           public void run() {
               synchronized (o){
                   System.out.println(Thread.currentThread()
                           .getName()+"开始");

                   try {
                       //Thread.sleep(1000);
                       o.wait();
                       System.out.println(Thread.currentThread().getName()+"又开始执行了");
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           }
       });


        Thread t2= new  Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o){
                    System.out.println(Thread.currentThread()
                            .getName()+"开始");

                    try {
                        //Thread.sleep(1000);
                        o.wait();
                        System.out.println(Thread.currentThread().getName()+"又开始执行了");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread t3= new  Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o){
                    System.out.println(Thread.currentThread()
                            .getName()+"开始");

                    try {
                        //Thread.sleep(2000);
                        o.notify();
                        System.out.println(Thread.currentThread().getName()+"结束");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.setName("A");
        t2.setName("B");
        t3.setName("C");
        t1.start();
        t2.start();
        t3.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2() throws InterruptedException {
        //System.out.println("哈哈");
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("-----------------------------");
                System.out.println(Thread.currentThread().getState());
                try {
                    Thread.currentThread().sleep(1000);
                    System.out.println(Thread.currentThread().getState());
                    System.out.println("新县城");
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
        t1.start();
       // System.out.println("睡了2s");
        // Thread.sleep(2000);
        System.out.println("结束");
    }

    public static void main(String[] args) {
        //System.out.println("哈哈");
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("-----------------------------");
                System.out.println(Thread.currentThread().getState());
                try {
                    Thread.currentThread().sleep(1000);
                    System.out.println(Thread.currentThread().getState());
                    System.out.println("新县城");
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
        t1.start();
        // System.out.println("睡了2s");
       /* try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束");*/
    }
}
