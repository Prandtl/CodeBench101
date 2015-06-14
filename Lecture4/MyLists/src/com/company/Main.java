package com.company;


public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(192837);
        list.add(123);
        list.add(42);

        for(int i=0;i<list.getLength();i++)
        {
            System.out.println(list.get(i));
        }

        list.delete(3);


        for(int i=0;i<list.getLength();i++)
        {
            System.out.println(list.get(i));
        }
    }

    public void outAll(MyLinkedList list)
    {
        for(int i=0;i<list.getLength();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println();
    }
}
