package com.fyb.basic.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @Auther: fang
 * @Date: 2019/3/11 19:15
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Buffer {
    private static final String LINE_SPARATOR =System.getProperty("line.separator");
    //缓存区(可以提高效率,比如数据库连接池,线程池),其实底层维护的就是一个数组,在读取数据时候,从设备(硬盘..)中读取到内存,写入数据的时候,从
    //内存中写入到设备,避免了读取的频繁切换

    //字节流缓冲区读取数据
    @Test
    public void test01() throws IOException {
        BufferedInputStream bufferedInputStream=null;
        BufferedOutputStream bufferedOutputStream=null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream("F:\\develop\\workspace\\practice\\temp\\buffer.txt"));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("F:\\develop\\workspace\\practice\\temp\\writerBuffer.txt"));
            int len=0;
            while ((len=bufferedInputStream.read())!=-1){
                bufferedOutputStream.write(len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedInputStream.close();
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //采用字符流缓存区进行读写数据,读取速度高于字符流一行行读取数据
    @Test
    public void test02_1(){
            BufferedReader bufferedReader=null;
            BufferedWriter bufferedWriter=null;

            try {
                bufferedReader = new BufferedReader(new FileReader("F:\\develop\\workspace\\practice\\temp\\buffer.txt"));
                bufferedWriter = new BufferedWriter(new FileWriter("F:\\develop\\workspace\\practice\\temp\\writerBuffer.txt"));
                int len =0;
                while ((len=bufferedReader.read())!=-1){
                    bufferedWriter.write(len);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bufferedReader.close();
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    //一行行的读取,在读取的时候,返回的是这一行的字符串,可以对字符串做判断,再操作数据
    @Test
    public void test02_2(){
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter=null;

        try {
            bufferedReader = new BufferedReader(new FileReader("F:\\develop\\workspace\\practice\\temp\\buffer.txt"));
            bufferedWriter = new BufferedWriter(new FileWriter("F:\\develop\\workspace\\practice\\temp\\writerBuffer.txt"));
            String str=null;
            while ((str=bufferedReader.readLine())!=null){
                bufferedWriter.write(str);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //获取当前类的字符集
    @Test
    public void testCharset(){
        String name = Charset.defaultCharset().name();
        System.out.println("字符集:"+name);
    }

    //测试换行
    @Test
    public void testLine_Separator() throws IOException {
        System.out.println("--------------------");
        System.out.println(LINE_SPARATOR);
        System.out.println("--------------------");
        FileWriter fileWriter = new FileWriter("D://temp.txt",true);
       fileWriter.write("abc"+LINE_SPARATOR+"efg");
        //fileWriter.flush();
        fileWriter.close();
    }

    @Test
    public void testFileRead_read() throws Exception{
        FileReader fileReader = new FileReader("D:\\temp.txt");
        char[] arr=new char[10];
        int len;
        int count=0;
        while ((len=fileReader.read(arr))!=-1){
            System.out.println("len的长度:"+len);
            for (int i = 0; i <len ; i++) {
                System.out.println(arr[i]);
                count=count+arr[i];
            }
        }

        System.out.println(count);
    }

    @Test
    public void testFileInputStream_read() throws Exception{
        FileInputStream fileInputStream = new FileInputStream("D://temp1.txt");
        byte[] arr=new byte[10];
        int len=0;
        while ((len=fileInputStream.read(arr))!=-1){
            for (int i = 0; i <arr.length ; i++) {
                System.out.println(arr[i]);
            }
        }
        //char c=(char)(read);
        //System.out.println(c);
        fileInputStream.close();
    }
}
