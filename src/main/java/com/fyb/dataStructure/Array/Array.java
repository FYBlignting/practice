package com.fyb.dataStructure.Array;

/**
 * @Auther: fang
 * @Date: 2019/4/4 11:43
 * @Description:
 */
public class Array<E> {

    private E[] data;
    private int size;

    public Array(int capacity){
        this.data=(E[])new Object[capacity];
        this.size=0;
    }
    
    public Array(){
        this(10);
    }
    
    public void clean(){
        this.size=0;
        data=(E[])new Object[10];
    }

    //根据索引查找元素
    public E get(int index){
        if(index<0||index>size-1)
            throw new IllegalArgumentException("index illegal");
       return data[index];
    }

    public E getFirst(){
        return get(0);
    }

    public E getLast(){
        return get(size-1);
    }

    //查找元素对应的索引
    public int find(E e){
        for (int i=0;i<size;i++){
            if(data[i].equals(e))
                return i;
        }
        return -1;
    }
    
    public E set(int index,E e){
        if(index<0 || index>size-1)
        throw new IllegalArgumentException("index illegal");
        E oldE=data[index];
        data[index]=e;
        return oldE;
    }
    
    public void addLast(E e){
       add(size,e);
    }

    public void add(int index,E e){
        if(index<0 || index>size)
            throw new IllegalArgumentException("index illegal");
        if(size==data.length)
            resize(data.length*2);
        for(int i=size;i>index;i--){
            data[size]=data[size-1];
        }
        data[index]=e;
        size++;
    }

    public void addFirst(E e){
        add(0,e);
    }

    public void removeElement(E e){
        int i = find(e);
        if(i!=-1)
            remove(i);
    }

    public E removeLast(){
       return remove(size-1);
    }

    public E removeFirst(){
        return remove(0);
    }

    public E remove(int index){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Remove failed. Index is illegal.");

        E ret = data[index];
        for(int i = index + 1 ; i < size ; i ++)
            data[i - 1] = data[i];
        size --;
        data[size] = null; // loitering objects != memory leak

        if(size == data.length / 2)
            resize(data.length / 2);
        return ret;
    }

    public int size(){
        return size;
    }


    private void resize(int newCapacity) {
        E[] newArray=(E[]) new Object[newCapacity];
        for (int i=0;i<size;i++){
            newArray[i]=data[i];
        }
        data=newArray;
        newArray=null;
    }

    public boolean contains(E e){
        int i = find(e);
        if(i!=-1)
            return true;
        return false;
    }

    public boolean isEmpty(){
        return (size==0)?true:false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        //stringBuilder.append(String.format("Array capacity=%d,size=%d\n"),data.length,size);
        stringBuilder.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
        stringBuilder.append("[");
        for (int i=0;i<size;i++){
            if(i!=size-1){
                stringBuilder.append(data[i]+",");
            }else {
                stringBuilder.append(data[i]);
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
