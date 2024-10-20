package ru.avaliev.home.algorithms.training;

import java.util.stream.Stream;

@FunctionalInterface
public interface MyClass  {


	<A,B,C,D, E extends Stream<?>> E transform(A a,B b,C c,D d);

}
