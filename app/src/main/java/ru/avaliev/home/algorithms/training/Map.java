package ru.avaliev.home.algorithms.training;

public interface Map<K, V> {

	int size();

	boolean containsKey(Object key);

	boolean containsValue(Object value);

	V get(Object key);

	V put(K key, V value);

	V remove(Object key);
}
