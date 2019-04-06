package com.fyb.dataStructure.stack;

/**
 * @Auther: fang
 * @Date: 2019/4/6 18:52
 * @Description:
 */
public class DemoServiceImpl implements DemoService {
    public static final String var = "今天天气很清凉";

    @Override
    public void say() {
        
    }
    
    public static void main(String[ ] args){
        eat(var);
        System.out.println("今天天气很清凉");
        System.out.println("今天天气很清凉");
        System.out.println("今天天气很清凉");
    }

    private static void sleep(String var) {
        System.out.println(var);
        System.out.println("今天天气很清凉");
    }

    private static void eat(String 今天天气很清凉) {
        System.out.println("今天天气很清凉");
        System.out.println(今天天气很清凉);
    }
}
