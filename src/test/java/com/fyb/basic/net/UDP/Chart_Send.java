package com.fyb.basic.net.UDP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Auther: fang
 * @Date: 2019/3/15 20:18
 * @Description:
 */
public class Chart_Send implements Runnable{
    private DatagramSocket datagramSocket;

    public Chart_Send(DatagramSocket datagramSocket){
        this.datagramSocket=datagramSocket;
    }

    @Override
    public void run(){
        try {
            System.out.println("准备发送数据");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(InetAddress.getLocalHost());
                InetAddress ip = InetAddress.getByName("169.254.203.255  ");

                //在一个局域网内255端口,就是广播形式发送
                byte[] bytes = line.getBytes();
                DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length,ip,10001);
                datagramSocket.send(datagramPacket);
                if("886".equals(line)){
                    System.out.println("聊天结束");
                    return;
                }
            }
            datagramSocket.close();

        } catch (Exception e){
            e.printStackTrace();
        }finally {
            datagramSocket.close();
        }
    }
}
