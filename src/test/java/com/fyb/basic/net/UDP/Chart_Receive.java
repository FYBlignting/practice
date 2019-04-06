package com.fyb.basic.net.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @Auther: fang
 * @Date: 2019/3/15 20:18
 * @Description:
 */
public class Chart_Receive implements Runnable{

    private DatagramSocket datagramSocket;

    public Chart_Receive(DatagramSocket datagramSocket){
            this.datagramSocket=datagramSocket;
        }

        @Override
        public void run() {
        try {
            while (true){
            System.out.println("准备接受数据");
                byte[] bytes = new byte[1024];
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
                datagramSocket.receive(dp);//阻塞
                //根据接收的数据包,获取发送端的ip地址,端口号,发送内容
                String hostAddress = dp.getAddress().getHostAddress();
                int port = dp.getPort();
                byte[] data = dp.getData();
                String dataStr = new String(data, 0, dp.getLength());
                System.out.println("addr:"+hostAddress+"port:"+port+"data:"+dataStr);
                /*datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                byte[] data = datagramPacket.getData();
                String dataStr = new String(data,0,length);
                System.out.println("收到消息:"+dataStr);*/

                if(dataStr.equals("886"))
                    return;
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            datagramSocket.close();
        }

        }
}
