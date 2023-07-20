package switchstuff;

import java.time.LocalDate;

public class Example2 {
  public static void main(String[] args) {
    int x = 1;
// line n1
    var d =
    switch(x) {
      case 1:
        System.out.println("found one!!!");
        yield LocalDate.of(2023, x, 1);
//        System.out.println("oops");
      default: yield LocalDate.of(2022, 12, 1);
    };
    System.out.println("d is " + d);
  }
}
