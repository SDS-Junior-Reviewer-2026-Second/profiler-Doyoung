package org.example;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    static ArrayList<Integer> generateData(int size) {
        ArrayList<Integer> data = new ArrayList<Integer>();

        for (int i = 0; i < size; i++) {
            int random = ThreadLocalRandom.current().nextInt(Integer.MAX_VALUE);
            data.add(random);
        }

        return data;
    }

    public static void main(String[] args) {
        Sorter<Integer> selectionSorter = new SelectionSorter<Integer>();
        Sorter<Integer> quickSorter = new QuickSorter<Integer>();
        Profiler profiler = new Profiler();

        profiler.setData(generateData(256));
        profiler.setLib(selectionSorter);
        profiler.runLib();
        profiler.showResult();

        profiler.setData(generateData(256));
        profiler.setLib(quickSorter);
        profiler.runLib();
        profiler.showResult();
    }
}
