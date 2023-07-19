package equality;

public class Ex2 {

  public static void main(String[] args) {
    String s1 = "Hello";
//    String s2 = new StringBuilder("Hello").toString();
    final String s2 = "He";
    final String s5 = "llo";
    String s6 = s2 + s5;
    String s3 = s2.intern();
    String s4 = "Hel" + "lo";

    System.out.println("s1 == s4? " + (s1 == s4));
    System.out.println("s1 == s2? " + (s1 == s2));
    System.out.println("s1 == s6? " + (s1 == s6));
  }
}
