package org.example;

import java.util.List;

public class SelectionSorter<T extends Comparable<T>> extends Sorter<T> {

    public void sort(List<T> list) {
        int size = list.size();

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    increment();
                    T temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}
