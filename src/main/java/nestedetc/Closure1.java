package nestedetc;


import java.util.function.Predicate;

public class Closure1 {
  public void doStuff() {
    /*final */int len = 3;
//    Predicate<String> ps = (String s) -> {
//        return s.length() > len; // line n1
//      };
    Predicate<String> ps = s -> s.length() > len ;

//    Predicate<String> ps = new Predicate<String>() {
//      @Override
//      public boolean test(String s) {
//        return s.length() > len; // line n1
//      }
//    };
    // line n2
//    System.out.println("testing lines " + (++len));

    System.out.println(ps.getClass().getName());
  }

  public static void main(String[] args) {
    new Closure1().doStuff();
  }
}
