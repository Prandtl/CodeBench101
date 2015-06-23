package com.company;

/**
 * Created by Vasiliy on 6/13/2015.
 */
public class Node<T> {
    public Node(T value) {
        this.value = value;
    }

    public void setNext(Node<T> nextNode) {
        next = nextNode;
    }

    public Node<T> getNext()
    {
        return next;
    }

    public T getValue()
    {
        return value;
    }

    private T value;
    private Node next;
}
