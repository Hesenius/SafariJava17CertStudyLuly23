package defaultmethods;

interface IntX {
  default void doStuff() { System.out.println("IntX.doStuff()"); }
//  void doStuff();
}

interface IntY extends IntZ {
//  default void doStuff() { System.out.println("IntY.doStuff()"); }
}

interface IntZ {
  default void doStuff() { System.out.println("IntZ.doStuff()"); }
}

class Thingy {
  public void doStuff() {
    System.out.println("Thingy.doStuff()");
  }
}

class ClQ extends Thingy implements IntX, IntY, IntZ {
  public void doStuff() {
    IntY.super.doStuff();
//    IntZ.super.doStuff(); // NO, can only go to IntY
    IntX.super.doStuff();
    super.doStuff(); // From Thingy!
    System.out.println("C1Q.doStuff()");
  }
}

public class Example {
  public static void main(String[] args) {
    new ClQ().doStuff();
  }
}
