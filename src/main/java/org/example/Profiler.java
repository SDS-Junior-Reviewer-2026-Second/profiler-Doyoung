package org.example;

import java.util.List;

public class Profiler {

    private List data;
    private Sorter sorter;

    public <T extends Comparable<T>> void setData(List<T> data) {
        this.data = data;
    }

    public <T extends Comparable<T>> void setLib(Sorter<T> sorter) {
        this.sorter = sorter;
    }

    public void runLib() {
        sorter.sort(data);
    }

    public void showResult() {
        System.out.println("data: " + data.toString());
        System.out.println("count: " + sorter.getCount());
    }
}
