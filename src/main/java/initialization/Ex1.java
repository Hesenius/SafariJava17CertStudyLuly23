package initialization;

class Mere {
  int x = 100;
  int y;
  // this.calculate calls the OVERRIDING method
  { y = this.calculate(); System.out.println("y is " + y);  }
  public int calculate() { return x * 2; }
  // default const
  Mere() {
    super(); // j.l.Object
    // run instance initialization
  }
}

class Enfant extends Mere {
  private int x = 150;
  @Override
  public int calculate() { return x * 3; }
  // default const
  Enfant() {
    super();
  }
}

public class Ex1 {
  public static void main(String[] args) {
    new Enfant();
  }
}
