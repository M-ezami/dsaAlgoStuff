package Collections.List.LinkedList.SingleLinkedList;

import Collections.List.LinkedList.MyLinkedList;

public class Main {
    static void main() {
        MyLinkedList <Integer> newLinkedList = new MyLinkedList<>();
        newLinkedList.add(1);
        newLinkedList.add(2);
        newLinkedList.add(4);
        System.out.println(newLinkedList.size());
        newLinkedList.clear();
        System.out.println(newLinkedList.size()+" after clearing");
    }
}
