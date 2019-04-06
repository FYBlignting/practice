package com.fyb.basic.collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @Auther: fang
 * @Date: 2019/3/28 10:05
 * @Description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ListTest {
    //ConcurrentModificationException
    @Test
    public void testArrayList_remove(){
        ArrayList<Integer> arrs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrs.add(i);
        }
        for (Integer num:arrs) {
            if(num%2==0){
                arrs.remove(num);
            }
        }
        System.out.println(arrs);
    }


    @Test
    public void testArrayList_remove1(){
        ArrayList<Integer> arrs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrs.add(i);
        }
        arrs.add(10);
        arrs.add(10);
        for (int j = 0; j < arrs.size(); j++) {
            if(arrs.get(j)%2==0){
                arrs.remove(j);
                j--;
            }
        }
        System.out.println(arrs);
    }


    //ConcurrentModificationException
    @Test
    public void testLinkedList_remove(){
        LinkedList<Integer> arrs = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            arrs.add(i);
        }
        for (Integer num:arrs) {
            if(num%2==0){
                arrs.remove(num);
            }
        }
        System.out.println(arrs);
    }

    @Test
    public void testLinkedList_remove1(){
        LinkedList<Integer> arrs = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            arrs.add(i);
        }
        arrs.add(10);
        arrs.add(10);
        for (int j = 0; j < arrs.size(); j++) {
            if(arrs.get(j)%2==0){
                arrs.remove(j);
                j--;
            }
        }
        System.out.println(arrs);
    }


    @Test
    public void testArrayList_Add(){
        ArrayList<Object> list = new ArrayList<>();
        list.add(12,20);
        System.out.println(list);
    }
}
