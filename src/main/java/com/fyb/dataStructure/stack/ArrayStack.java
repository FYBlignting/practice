package com.fyb.dataStructure.stack;

/**
 * @Auther: fang
 * @Date: 2019/4/5 10:45
 * @Description:
 */
public interface ArrayStack<E> {

    public boolean isEmpty();

    public void push();

    public E pop();

    public E peek();

    public int getSize();
}
