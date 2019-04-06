package com.fyb.basic.net.UDP;

import java.io.IOException;
import java.net.*;

/**
 * @Auther: fang
 * @Date: 2019/3/15 02:17
 * @Description:
 */
public class Socket_UDP_Send {

    public static void main(String[] args) throws IOException {
        /*UDP协议发送消息:
        1.创建DatagramSocket
        2.创建数据包
        3.使用DatagramSocket的send()方法发送数据
        4.关闭连接
        * */
        System.out.println("启动发送端");
        DatagramSocket datagramSocket = new DatagramSocket();
        String data ="根据UDP协议发送消息";
        byte[] bytes = data.getBytes();
        InetAddress ip = InetAddress.getByName("localhost");
        DatagramPacket datagramPacket=new DatagramPacket(bytes,bytes.length,ip,10000);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
