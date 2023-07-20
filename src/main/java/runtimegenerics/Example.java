package runtimegenerics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Example {
  public static void breakAList(List l) {
    l.add(LocalDate.now());
  }
  public static void main(String[] args) {
    List<String> names = new ArrayList<>(List.of("Fred"));
//    names.add(LocalDate.now());
    breakAList(names);

    String n1 = names.get(0);
    System.out.println(n1);
    String n2 = names.get(1);
    System.out.println(n2);
  }
}
