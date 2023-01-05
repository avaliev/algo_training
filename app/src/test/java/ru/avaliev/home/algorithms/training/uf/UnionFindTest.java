package ru.avaliev.home.algorithms.training.uf;

import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Scanner;

public class UnionFindTest {

    @Test
    public void checkRun() {
        InputStream resourceAsStream = ClassLoader.getSystemClassLoader().getResourceAsStream("uf/tinyUF.txt");
        Scanner scanner = new Scanner(resourceAsStream);
        UnionFind unionFind = null;
        if (scanner.hasNextInt()) {
            int count = scanner.nextInt();
            unionFind = new UnionFind(count);
            while (scanner.hasNextInt()) {
                int p = scanner.nextInt();
                int q = scanner.nextInt();
                System.out.println("scanner read : " + p + " and " + q);
                if (!unionFind.connected(p, q)) {
                    unionFind.union(p, q);
                }
            }
        }
    }

}