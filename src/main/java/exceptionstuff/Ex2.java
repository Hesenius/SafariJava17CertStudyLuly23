package exceptionstuff;

class AC implements AutoCloseable {
  private String name;

  public AC(String name) {
    this.name = name;
  }

  @Override
  public void close() {
    System.out.println("Closing " + name);
  }
}

public class Ex2 {
  public static void main(String[] args) {
    var ac0 = new AC("zero");
    try (
        var ac1 = new AC("one"); // must implement AutoCloseable
        var ac2 = new AC("two");
        ac0; // ALL resources must be final, or effectively final
    ) {
      int x = 99;
    } // auto generated finally closes all "resources"

//    ac0 = null; // this would break usage on line 22!!!!

//    finally {
////      System.out.println(x); // out of scope!
//    }
  }
}
