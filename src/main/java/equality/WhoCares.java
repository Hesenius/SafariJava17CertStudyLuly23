package equality;

import java.util.List;

class Thing extends java.lang.Object {
  private int count;

  public Thing(int count) {
    this.count = count;
  }

  @Override
//  public boolean equals(Thing other) { //NOT OVERRIDE
    public boolean equals(Object other) {
      System.out.println("Testing a Thing");
      return false;
    }
  }
  public class WhoCares {
  public static void main(String[] args) {
    List<String> names = List.of("Fred", "Jim");
    System.out.println(names.contains("Fred"));
    System.out.println(names.contains(Integer.valueOf(99)));

    List<Thing> lt = List.of(new Thing(1), new Thing(2));
    System.out.println(lt.contains(new Thing(1)));
  }
}
