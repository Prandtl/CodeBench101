package com.company;

/**
 * Created by Vasiliy on 6/13/2015.
 */
public class Node {
    public Node(Integer value) {
        this.value = value;
    }

    public void setNext(Node nextNode) {
        next = nextNode;
    }

    public Node getNext()
    {
        return next;
    }

    public Integer getValue()
    {
        return value;
    }

    private Integer value;
    private Node next;
}
