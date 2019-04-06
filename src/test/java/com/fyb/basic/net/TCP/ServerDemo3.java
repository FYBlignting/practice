package com.fyb.basic.net.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: fang
 * @Date: 2019/3/16 00:33
 * @Description:
 */
public class ServerDemo3 {
    /**
     * 服务端:
     * 1.创建ServerSocket,对外开放一个服务端口,用于提供服务
     * 2.接收客户端对象(服务端只负责提供服务,谁连接服务端,服务端可以指定客户端是谁)
     * 3.获取输入流,读取消息
     * 4.通道数量有限,需要关闭连接(在服务端断开与客户端的连接)
     */
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10002);
        //接受客户端对象
          Socket socket = serverSocket.accept();//阻塞
        System.out.println(socket.getInetAddress().getHostName()+"connection");
            //获取输入流
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true);
        String line=null;
        while((line=bufferedReader.readLine())!=null){
            System.out.println(line);
            printWriter.println(line.toUpperCase());
        }

        //断开客户端连接
        socket.close();
        //断开服务端连接(服务端一般不关闭)
        serverSocket.close();
    }
}
