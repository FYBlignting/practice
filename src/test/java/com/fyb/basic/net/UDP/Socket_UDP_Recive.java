package com.fyb.basic.net.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @Auther: fang
 * @Date: 2019/3/15 02:18
 * @Description:
 */
public class Socket_UDP_Recive {
    public static void main(String[] args) throws IOException {
        System.out.println("启动接收端");
          /*UDP协议接受消息:
        1.创建DatagramSocket,并指定接受的端口号
        2.创建接收数据包
        3.使用DatagramSocket的recive()方法接收数据
        4.关闭连接
        * */
        DatagramSocket datagramSocket = new DatagramSocket(10000);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        datagramSocket.receive(dp);//阻塞
        //根据接收的数据包,获取发送端的ip地址,端口号,发送内容
        String hostAddress = dp.getAddress().getHostAddress();
        int port = dp.getPort();
        byte[] data = dp.getData();
        String dataStr = new String(data, 0, dp.getLength());
        System.out.println("addr:"+hostAddress+"port:"+port+"data:"+dataStr);
    }
}
