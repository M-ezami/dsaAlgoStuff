package Collections.List.DynamicSizeArray;

import Collections.List.MyList;

public class MyArrayList<G> implements MyList<G> {
    private Object[] data;
    private int size;

    public MyArrayList(){
    this.size = 0;
    this.data = new Object[10];
    }

    @Override
    public void add(G value) {
        if (data.length<=this.size){
            Object[]newData = new Object[data.length+10];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            this.data = newData;
        }

        data[size]= value;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    // we have to add (g) here because othewise we could say String s = get.0 even though if list was type int this is
    // because compiler will know once lsit is decalred with a type that we can only return g type ...
    // this wont through an exception if add is correct but htis is much better practice
    // this would be a classcastexxception when u try to cast something at runtime to an object it actually is not

    @Override
    @SuppressWarnings("unchecked")
    public G get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + size);
        }
        return (G) data[index];
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        this.size = 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (o == null) {
                if (data[i] == null) return true;
            } else {
                if (o.equals(data[i])) return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

}
