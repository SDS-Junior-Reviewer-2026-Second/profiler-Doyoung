package org.example;

import java.util.List;

public class QuickSorter<T extends Comparable<T>> extends Sorter<T> {

    int partition(List<T> list, int low, int high) {
        int i, j;
        T pivot = list.get(high);

        for (j = low, i = low - 1; j <= high - 1; j++) {
            if (list.get(j).compareTo(pivot) < 0) {
                i++;

                T temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);

                increment();
            }
        }

        T temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);

        return i + 1;
    }

    void quickSort(List<T> list, int low, int high) {
        if (low < high) {
            int i = partition(list, low, high);
            quickSort(list, low, i - 1);
            quickSort(list, i + 1, high);
        }
    }

    public void sort(List<T> list) {
        quickSort(list, 0, list.size() - 1);
    }
}
