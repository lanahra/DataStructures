package de.unistuttgart.dsaws2017.ex04.p1;

import java.util.ArrayList;
import java.util.List;

public class CompleteKAryTree<T extends Comparable<T>> implements IKAryTree<T> {

    CompleteKAryTree(int k) {
        this.k = k;
    }

    private int k;
    private List<T> array = new ArrayList<T>();

    @Override
    public List<T> getArray() {
        return this.array;
    }

    @Override
    public void insert(T element) {
        this.array.add(element);
    }

    @Override
    public T getChildOf(int nodeIndex, int childIndex) {
        return this.array.get(nodeIndex * childIndex + this.k);
    }

}
