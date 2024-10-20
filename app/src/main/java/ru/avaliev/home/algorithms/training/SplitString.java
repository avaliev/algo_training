package ru.avaliev.home.algorithms.training;

import java.util.LinkedHashMap;

public class SplitString {

  public static void main(String[] args) {

    int[] array = {9, 4, 9, 6, 7, 4, 5};

    LinkedHashMap<Integer, Integer> map = new LinkedHashMap();

    for (int i = 0; i < array.length; i++) {
      Integer elem = new Integer(array[i]);
      if (map.containsKey(elem)) {
        var count = map.get(elem);
        map.put(elem, ++count);
      } else {
        map.put(elem, 1);
      }
    }
    var result =
        map.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst().get().getKey();

    System.out.println("First Unique Element is " + result);
    // TODO
  }

  public static void print(Object o) {
    System.out.println(o);
  }
}
