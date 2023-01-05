package ru.avaliev.home.algorithms.training.uf;

import java.util.stream.IntStream;

public class UnionFind {

    private int N;


    int[] ids;


    /**
     * count of objects in
     */
    public UnionFind(int n) {
        N = n;
        ids = IntStream.range(0, N).toArray();
    }


    // идея связанные элементы имеют одинаковый id подмножества
    public boolean connected(int p, int q) {
        return ids[p] == ids[q];
    }

    public void union(int p, int q) {
        int pId = ids[p];
        int qId = ids[q];

        for (int i = 0; i < N; i++) {
            if (ids[i] == pId) {
                ids[i] = qId;
            }
        }
    }
}
