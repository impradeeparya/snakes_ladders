@FunctionalInterface
public interface QuadFunction<A, B, C, D, E> {

  E apply(A a, B b, D d, C c);
}
