package lambdastuff;

import java.util.function.ToIntFunction;

@FunctionalInterface
interface VarArgFn<A, R> {
  R apply(A ... arg);
//  void doStuff();
  String toString();
}

public class Ex {
  public static void main(String[] args) {
    ToIntFunction<String> obj;
    obj = (String x) -> x.length();
    // assignment to var
    // assignment to actual param of method
    // assignment to return value of function
    // casting
    Object obj2 = (ToIntFunction<String>)(String x) -> x.length();

    VarArgFn<String, String> concat = s -> {
      StringBuilder sb = new StringBuilder();
      for (String s1 : s) {
        sb.append(s1);
      }
      return sb.toString();
    };
    System.out.println(concat.apply("Fred", "Jim", "Sheila"));
  }
}
