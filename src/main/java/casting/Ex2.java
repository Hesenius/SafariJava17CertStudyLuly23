package casting;

/*final */class Base {
  void doBaseStuff() {
    System.out.println("doBaseStuff");
  }
}

class Sub extends Base {
  void doBaseStuff() {
    System.out.println("doSubStuff");
  }

  void doOtherStuff() {
    System.out.println("doOtherStuff");
  }
}
//class SubSub extends Sub implements Runnable {
//  public void run() {}
//}

public class Ex2 {
  public static void main(String[] args) {
    Base b = new Sub();
    ((Runnable) b).run();

    // impossible casts are rejected...
//    String s = "x";
//    Integer i = (Integer)s;
  }
}
