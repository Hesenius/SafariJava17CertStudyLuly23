package patternmatch;

import java.util.Collection;
import java.util.List;

public class Ex2 {

  public static void main(String[] args) {
    Iterable<String> is = List.of("a", "b", "c");
    Object obj = is;
//    A)
    System.out.println(is instanceof List);
//    B)
    System.out.println(obj instanceof List l && l.size() > 2);
//    C)
//    System.out.println(obj instanceof List<String> ls);
//    D)
    System.out.println(is instanceof Collection<? extends CharSequence> cs);
//    E)
//    System.out.println(is instanceof List<String> ls || ls.size() > 2);
  }
}
