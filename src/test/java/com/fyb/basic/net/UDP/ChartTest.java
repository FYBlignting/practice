package com.fyb.basic.net.UDP;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Auther: fang
 * @Date: 2019/3/15 10:27
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ChartTest{
    //Junit与System.in不兼容需要使用main方法测试键盘录入

    public static void main(String[] args) throws IOException{
        DatagramSocket send = new DatagramSocket();
        DatagramSocket receive = new DatagramSocket(10001);

        new Thread(new Chart_Send(send)).start();
        new Thread(new Chart_Receive(receive)).start();
    }


   @Test
    public void chart() throws Exception{
       DatagramSocket send = new DatagramSocket();
       DatagramSocket receive = new DatagramSocket(10001);

       new Thread(new Chart_Send(send)).start();
       new Thread(new Chart_Receive(receive)).start();
   }

   @Test
    public void test1() throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       String line=null;
       while ((line=bufferedReader.readLine())!=null){
           System.out.println(line);
           if(line.equals("886"))
               return;
       }
   }

   @Test
    public void tese2()throws IOException{
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       System.out.println(bufferedReader.readLine());
   }


}
