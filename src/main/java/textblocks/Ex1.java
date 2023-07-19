package textblocks;

public class Ex1 {
  public static void main(String[] args) {
//    String message = """Hello\
    String message = """
    ""\"""\"""Hello\n\n
    Java 17 World!""";
    System.out.println(message + "XXX");
    String format = "hello %s, how are you. I count %d";
    String result = String.format(format, "Albert", 99);
    System.out.println(result);

  }
}
