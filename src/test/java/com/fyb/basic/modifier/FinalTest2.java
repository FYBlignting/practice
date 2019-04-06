package com.fyb.basic.modifier;

/**
 * @Auther: fang
 * @Date: 2019/3/7 23:36
 * @Description:
 */
public final class FinalTest2 {
    //private String name;

    public final String name;

    public FinalTest2(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "FinalTest2{" +
                "name='" + name + '\'' +
                '}';
    }
}
