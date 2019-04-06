package com.fyb.basic.net.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Auther: fang
 * @Date: 2019/3/16 00:16
 * @Description:
 */
public class ClientDemo {
    /*
    * 客户端:
    * 1.创建Socket对象,建议在创建Socket时指定ip和端口号,这样创建Socket的时候,就可以直接建立连接,
    * 建立连接后,就形成了通信管道,也就是Socket流(用于网络传输通信的流,既可以输入,也可以输出)
    * 2.获取输出流,
    * 3.发送消息
    * 4.关闭资源
    * */

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("169.254.203.170", 10002);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("加油吧少年".getBytes());
        socket.close();
    }

}
