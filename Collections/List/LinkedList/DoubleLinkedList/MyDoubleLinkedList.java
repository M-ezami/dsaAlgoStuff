package Collections.List.LinkedList.DoubleLinkedList;

import Collections.List.MyList;

public class MyDoubleLinkedList<G> implements MyList<G> {
    public MyNodeD<G> head;
    public MyNodeD<G> tail;
    public int size;


    public MyDoubleLinkedList() {
        this.head = null;
        this.tail= null;
        this.size=0;
    }

    @Override
    public void add(G value) {
        MyNodeD<G> newNode = new MyNodeD<>(value);


        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;


    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public G get(int index) {
        int counter= 0;
        MyNodeD<G> current = head;

        while(counter<index){
            current = current.next;
            counter++;
            if(counter == index){
                return  current.value;
            }

        }
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
