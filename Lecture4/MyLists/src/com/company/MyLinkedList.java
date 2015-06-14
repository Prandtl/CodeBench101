package com.company;

/**
 * Created by Vasiliy on 6/13/2015.
 */
public class MyLinkedList {
    public void add(Integer a) {
        if (length == 0) {
            root = new Node(a);
            last = root;
        } else {
            Node newNode = new Node(a);
            last.setNext(newNode);
            last = newNode;
        }
        length++;
    }

    public Integer get(int i) {
        int currentIndex = 0;
        Node currentNode = root;
        while (currentIndex < i) {
            currentNode = currentNode.getNext();
            currentIndex++;
        }
        return currentNode.getValue();
    }

    public void delete(int i) {
        if (i == 0) {
            root = root.getNext();
        } else {
            Node current = root.getNext();
            Node previous = root;
            int currentIndex = 1;
            while(currentIndex<i-1)
            {
                previous=current;
                current=current.getNext();
                currentIndex++;
            }
            previous.setNext(current.getNext());
        }
        length--;
    }

    public int getLength() {
        return length;
    }

    Node root;
    Node last;
    int length;
}
