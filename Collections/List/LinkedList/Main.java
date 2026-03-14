package Collections.List.LinkedList;

import Collections.List.LinkedList.DoubleLinkedList.MyDoubleLinkedList;
import Collections.List.LinkedList.DoubleLinkedList.MyNodeD;
import Collections.List.LinkedList.SingleLinkedList.MyLinkedList;

public class Main {
    static void main() {
        MyLinkedList<Integer> newLinkedList = new MyLinkedList<>();
        newLinkedList.add(1);
        newLinkedList.add(2);
        newLinkedList.add(4);
        System.out.println(newLinkedList.size());
        newLinkedList.clear();
        System.out.println(newLinkedList.size()+" after clearing");


        MyDoubleLinkedList<Integer> newDoubleLinkedList = new MyDoubleLinkedList<>();
         newDoubleLinkedList.add(1);
        newDoubleLinkedList.add(2);
        System.out.println(newDoubleLinkedList.size);
        Integer joe = newDoubleLinkedList.get(1);

        System.out.println();
    }
}
