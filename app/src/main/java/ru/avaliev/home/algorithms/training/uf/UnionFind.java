package ru.avaliev.home.algorithms.training.uf;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * реализация объединения N различных объектов подмножества.
 */
public class UnionFind {

    private int N;


    int[] ids;

    int[] size;


    /**
     * count of objects in
     */
    public UnionFind(int n) {
        N = n;
        ids = IntStream.range(0, N).toArray();
        size = new int[n];
        Arrays.fill(size, 1);
    }


    private int root(int i) {
        while (i != ids[i]) {
            ids[i] = ids[ids[i]];
            i = ids[i];
        }
        return i;
    }

    // идея связанные элементы имеют одинаковый id подмножества
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        if (i == j) return;


        if (size[i] <= size[j]) {
            ids[i] = j;
            size[j] += size[i];
        } else {
            ids[j] = i;
            size[i] += size[j];
        }
    }
}
