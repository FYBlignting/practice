package com.fyb.modifier.finalTest;

/**
 * @Auther: fang
 * @Date: 2019/3/26 11:29
 * @Description:
 */
public class finalDemo {

    //string类常量与常量运算，生成的常量，在常量池
    //常量与比变量生成的值，不在常量池

    static final int a=10;
    static final int b=20;
    static int c=10;
    static int d=20;

    public static void main(String[] args) {
        int sum1=a*b;
        int sum2=c*d;

        String a="hello2";
        String b="hello";
        final String c="hello";
        String d=b+2;
        String e=c+2;
        String f=new String("hello")+2;

       /* System.out.println("a.hashcode"+a.hashCode());
        System.out.println("b.hashcode"+b.hashCode());
        System.out.println("e.hashcode"+e.hashCode());
        System.out.println("d.hashcode"+d.hashCode());*/

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(d));
        System.out.println(System.identityHashCode(e));
        System.out.println(System.identityHashCode(f));
        System.out.println(a==d);
        System.out.println(a==e);
        test(2);
        test(3);
    }


    public static void test(final int i){
        System.out.println(i);
    }

}
