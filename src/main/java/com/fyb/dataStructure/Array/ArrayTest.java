package com.fyb.dataStructure.Array;

/**
 * @Auther: fang
 * @Date: 2019/4/4 12:35
 * @Description:
 */
public class ArrayTest {

    public static void main(String[] args) {
        Array<Integer> arr = new Array<>();
        for(int i=0;i<10;i++){
            arr.addLast(i);
        }
        arr.add(10,15);
        System.out.println(arr);
        Integer remove = arr.remove(9);

        System.out.println(arr);
        boolean flag = arr.contains(16);
        System.out.println(flag);
        System.out.println("111");
    }
}
