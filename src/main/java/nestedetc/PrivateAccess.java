package nestedetc;

class Outer1 {

  class Inner1 {

    // these two are identical in their generated code
//    public Inner1() {}
    // this type of explict "this" passing supports annotations
    private int y = 100;
    public Inner1(/*@Something*/ Outer1 Outer1.this) {}
//    private int x = 500;
    // line n1
    void showX(Inner1 this) { // Explicit "receiver parameter" :)
      System.out.println("x is " + Outer1.this.x); }
  }
//  class Inner2 {
//    private int y = 100;
//    // line n1
//  }
  private int x = 99;
  // line n2
  void showY() {
    Inner1 i1 = null;
    System.out.println("y is " + i1.y);
  }
  void showAnotherY(Inner1 another) {
    System.out.println("y is " + another.y);
  }
//  static Inner1 makeOne() { return new Inner1(); }
  static Inner1 makeOne() { return (new Outer1()).new Inner1(); }
//  Inner1 makeOne() { return this.new Inner1(); }
}

/*
    void showX() { sop("x is " + x); }
    void showY() { sop("y is " + y); }
    void showAnotherY(Inner1 another) { sop("y is " + another.y); }

  static Inner1 makeOne() { return new Inner1(); }
*/

public class PrivateAccess {
}
