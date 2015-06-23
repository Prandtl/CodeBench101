package com.company;

/**
 * Created by Vasiliy on 6/13/2015.
 */
public class MyLinkedList<T> {
    public void add(T a) {
        if (length == 0) {
            root = new Node<T>(a);
            last = root;
        } else {
            Node newNode = new Node<T>(a);
            last.setNext(newNode);
            last = newNode;
        }
        length++;
    }

    public T get(int i) {
        int currentIndex = 0;
        Node<T> currentNode = root;
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
            Node<T> current = root.getNext();
            Node<T> previous = root;
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

    public <S extends T> void addList(MyLinkedList<S> a){
        for (int i =0;i<a.getLength();i++)
        {
            S element = a.get(i);
            add(element);
        }
    }
    
    public <S extends TestInterface> void hello(S helloObj){
        helloObj.hello();
    }

    public int getLength() {
        return length;
    }

    Node<T> root;
    Node<T> last;
    private int length;
}
