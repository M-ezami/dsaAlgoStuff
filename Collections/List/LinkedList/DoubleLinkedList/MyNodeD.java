package Collections.List.LinkedList.DoubleLinkedList;

public class MyNodeD<G> {
    G value;
    public MyNodeD<G> next;
    public MyNodeD<G> prev;

    public MyNodeD(G value){
        this.next = null;
        this.prev = null;
        this.value = value;
    }
}
