package com.fyb.basic.net.TCP;

import java.io.*;
import java.net.Socket;

/**
 * @Auther: fang
 * @Date: 2019/3/16 00:16
 * @Description:
 */
public class ClientDemo3 {
    /*
    * 需求:
    * 客户端发送字母数据,服务端接收后,将数据打印到控制台,并将数据转换成大写,返回给客户端
    * */

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("169.254.203.170", 10002);
        //获取输出流
        OutputStream outputStream = socket.getOutputStream();
        //将数据写的服务端
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter printWriter = new PrintWriter(outputStream,true);
        String line=null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        while ((line=bufferedReader.readLine())!=null){
            printWriter.println(line);
            //接受服务端消息
            String upperStr=reader.readLine();
            System.out.println(upperStr);
            if("over".equals(line))
                return;
        }
        socket.close();
    }

}
