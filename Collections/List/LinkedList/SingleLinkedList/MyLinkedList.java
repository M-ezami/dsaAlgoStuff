package Collections.List.LinkedList.SingleLinkedList;

import Collections.List.MyList;


public class MyLinkedList<G> implements MyList<G> {
    private MyNode<G> head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }


    @Override
    public void add(G value) {
        MyNode<G> newMyNode = new MyNode<>(value);
        if (head == null) {
            this.head = newMyNode;
        } else {
            MyNode<G> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newMyNode;
        }
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public G get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        MyNode<G> current = head;
        int counter = 0;

        while (counter < index) {
            current = current.next;
            counter++;
        }

        return current.value;
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public boolean contains(Object o) {
        MyNode<G> current = head;

        while (current != null) {
            if (o == null) {
                if (current.value == null) {
                    return true;
                }
            } else {
                if (o.equals(current.value)) {
                    return true;
                }
            }
            current = current.next;
        }

        return false;
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
