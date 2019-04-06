package com.fyb.basic.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Auther: fang
 * @Date: 2019/3/6 11:27
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class FileInputSreamAndFileOutputStreamTest {

    //一次读取一个字节
    @Test
    public void testFileInputStreamRead() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("F:/homework/temp.txt");
        int b=0;
        while ((b=fileInputStream.read())!=-1){
            System.out.println(b);
        }
        fileInputStream.close();
    }
    //一次读取多个字节,默认1024整数倍
    @Test
    public void testFileInputSreamReadMore() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream("F:/homework/temp.txt");
            fileOutputStream = new FileOutputStream("F:/homework/write.txt");
            byte[] arr = new byte[1024 * 8];
            int leng;
            while ((leng = fileInputStream.read(arr)) != -1) {
                fileOutputStream.write(arr, 0, leng);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
