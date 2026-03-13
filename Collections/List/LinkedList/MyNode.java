package Collections.List.LinkedList;

public class MyNode<G> {
    G value;
    public MyNode<G> next;

    public MyNode(G value){
        this.value = value;
        this.next = null;
    }

}
