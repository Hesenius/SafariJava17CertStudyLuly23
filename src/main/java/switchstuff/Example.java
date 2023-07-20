package switchstuff;

public class Example {
  public static void main(String[] args) {
    String s = "Hello";
//    String s = "Hi";
//    String s = null;
    final String llo = "llo";
    // arguments integral of int and smaller (and wrappers), String, and enum
    switch (s) {
//      case "Hi":
//      case "He" + llo:
      case "Hi", "He" + llo:
        System.out.println("Bonjour");
        break;
      case "Goodbye":
        System.out.println("Au revoir");
        break;
    }

    System.out.println("----------------");
    switch (s) {
//      case "Hi" -> // nope, don't do this alternation in arrow form
      case "Hi", "Hello" -> { // do this!
        System.out.println("Bonjour");
        System.out.println("Huh");
      }
      case "Goodbye" ->
        System.out.println("Au revoir");
    }

    System.out.println("----------------");
    var msg = switch(s) {
      case "Hi", "Hello" -> {
        System.out.println("found a greeting");
        // yield is necessary in the block form of expression with arrow
        yield "Bonjour";
      }
      default -> throw new IllegalArgumentException("uh oh");
    };
//    if (Math.random() > 0.5)
//      System.out.println("big");
//      System.out.println("yup, I call that big");
//    else {}
  }
}
