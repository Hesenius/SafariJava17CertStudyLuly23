package initialization;

enum Weird2 {
  // these are public static final Weird2 fields
  VAL1, VAL2;
  static {
    System.out.println("Finishing static init of enum");
  }
  {
    System.out.println("running instance init");
  }
}
public class WeirdInit {
  static {
    System.out.println("starting static init");
  }
  static WeirdInit self = new WeirdInit();
  static {
    System.out.println("Finishing static init");
  }
  {
    System.out.println("instance init");
  }
}

class RunIt {
  public static void main(String[] args) {
    System.out.println("Starting");
    new WeirdInit();
    System.out.println("Finishing");
    System.out.println("enum...");
    Object obj = Weird2.VAL1;
  }
}
