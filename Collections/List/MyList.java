package Collections.List;

public interface MyList<G> {
    void add(G value);
    int size();
    G get(int index);
    void clear();
    boolean contains(Object o);
    boolean isEmpty();
    int hashCode();
    /*Iterator<G> iterator(); lets add later aswell an iterator
    /*void addAll() will be added later as we add collection*/

}
