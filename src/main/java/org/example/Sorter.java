package org.example;

import java.util.List;

public abstract class Sorter<T extends Comparable<T>> {

    private int count = 0;

    public abstract void sort(List<T> list);

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
