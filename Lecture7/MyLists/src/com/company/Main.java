package com.company;


public class Main {

    public static void main(String[] args) {
        MyLinkedList<String> stringMyLinkedList = new MyLinkedList<String>();

        stringMyLinkedList.add("aaaa");
        stringMyLinkedList.add("bbbb");
        stringMyLinkedList.add("hello");
        stringMyLinkedList.add("Generics rule");

        MyLinkedList<Integer> firstList = new MyLinkedList<Integer>();
        MyLinkedList<Integer> secondList = new MyLinkedList<Integer>();

        firstList.add(4);
        firstList.add(5);
        firstList.add(1);
        secondList.add(1);
        secondList.add(1);
        secondList.add(2);

        MyLinkedList<Double> doubleList = new MyLinkedList<Double>();
        doubleList.add(42d);
        doubleList.add(42.2d);
        doubleList.add(-3d);
        doubleList.add(-0.333d);
        doubleList.add(10d);

        for(int i=0;i<firstList.getLength();i++)
        {
            System.out.println(firstList.get(i));
        }
        for(int i=0;i<secondList.getLength();i++)
        {
            System.out.println(secondList.get(i));
        }

        System.out.println("------------------------------------");
        for(int i=0;i<firstList.getLength();i++)
        {
            System.out.println(firstList.get(i));
        }
        for(int i=0;i<secondList.getLength();i++)
        {
            System.out.println(secondList.get(i));
        }

        System.out.println("------------------------------------");
        MyLinkedList<Number> numList = new MyLinkedList<Number>();
        numList.addList(firstList);
        numList.addList(secondList);
        numList.addList(doubleList);

        for(int i=0;i<numList.getLength();i++)
        {
            System.out.println(numList.get(i));
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
