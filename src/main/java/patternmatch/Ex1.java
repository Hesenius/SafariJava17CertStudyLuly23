package patternmatch;

class Thing{}
public class Ex1 /*extends java.lang.Object*/ {
  public static void main(String[] args) {
    String s = "Hello";
//    s = Integer.valueOf(99);
//    if (s instanceof Integer) {}
//    if (s instanceof Runnable) {}
    Thing t = new Thing();
    if (t instanceof Runnable) {}


    Object obj = "Hello";
//    Object obj = 99;
    boolean answered = false;
    if (obj instanceof String) {
      String str = (String)obj;
      if (str.length() > 3) {
        System.out.println(str);
        answered = true;
      }
    }
    if (!answered) System.out.println("Nope");

//    if (!(obj instanceof String str)) {
//      System.out.println(str);
//    } else {
//      // NOPE, not in scope!!
//      System.out.println(str);
//    }

//    do {
////      if (Math.random() > 0.5) break;
//    } while (!(obj instanceof String str));
//    System.out.println(str);

    System.out.println(obj instanceof String str && str.length() > 3 ? str : "Nope");

//    if (obj instanceof String str when str.length() > 3)
//    System.out.println(str);
//      else
//    System.out.println("Nope");
//
//    if (obj instanceof String str if str.length() > 3)
//    System.out.println(str);
//      else
//    System.out.println("Nope");
//
//    System.out.println(obj instanceof String.class str && str.length() > 3 ? str : "Nope");
//
    if (!(obj instanceof String str) || str.length() <= 3)
      System.out.println("Nope");
    else
      System.out.println(str);
  }
}
