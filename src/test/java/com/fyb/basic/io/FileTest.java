package com.fyb.basic.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;

/**
 * @Auther: fang
 * @Date: 2019/3/6 11:40
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class FileTest {

    //案例 删除文件或者文件夹
    //1.判断是否是文件还是文件夹,如果是文件直接删除
    //2.如果是文件夹,则循环遍历,递归删除
    //3.删除空文件夹
    public void testDeleteAll(File file){
       if(file.isFile()){
           System.out.println(file.getName());
            file.delete();
            return;
       }
        File[] files = file.listFiles();
        for(File file1:files){
            testDeleteAll(file1);
        }
       boolean flag= file.delete();
        System.out.println("删除"+flag+file.getName());
    }

    @Test
    public void testdeleteAll_Start(){
        testDeleteAll(new File("F:/temp1"));
    }

    //测试File获取的方法类
    @Test
    public void testGet(){
        File file = new File("D:/homework/temp.txt");
        String absolutePath = file.getAbsolutePath();
        System.out.println("绝对路径:"+absolutePath);
        String name = file.getName();
        System.out.println("文件名称"+name);
    }

    @Test
    public void testList(){
        File file = new File("F:/homework/");
        //获取当前路径下的所有文件和文件夹名称
        String[] list = file.list();
        for (String name:list){
            System.out.println(name);
        }
        //获取当前路径下的所有文件和文件夹名称以File对象的形式返回
        System.out.println("----------------------------------");
        File[] files = file.listFiles();
        for (File file1:files){
            System.out.println(file1);
        }
    }

    //判断方法
    @Test
    public void testIs(){
        File file = new File("F:/homework");
        System.out.println("是否是文件:"+file.isFile());
        System.out.println("是否是文件夹"+file.isDirectory());
    }

    //删除方法 ,只能删除空文件夹或者文件

    @Test
    public void testDelete(){
        File file = new File("F:/temp");
        boolean delete = file.delete();
        System.out.println("此文件夹不为空,所以"+delete+"删除");
        file.deleteOnExit();
    }


}
