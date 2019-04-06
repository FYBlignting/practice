package com.fyb.Thread;

/**
 * @Auther: fang
 * @Date: 2019/3/24 23:12
 * @Description:
 */
public class TestSleep {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("---------------------");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("结束");
            }
        }).start();
    }
}
