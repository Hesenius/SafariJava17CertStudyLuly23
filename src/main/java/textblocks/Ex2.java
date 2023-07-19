package textblocks;

public class Ex2 {
  public static void main(String[] args) {
    String message = """
        Hello         
            Java 17 World!""";
    System.out.println(message + "XXX");

    String m2 = """
        X    
            Y
            """;
    System.out.printf("length of m2 is %d\nValue is\n:%s:\n",
      m2.length(), m2);
  }
}
