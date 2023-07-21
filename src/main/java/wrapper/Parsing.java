package wrapper;

public class Parsing {
  public static void main(String[] args) {
    System.out.println(Double.parseDouble("+Infinity"));
    System.out.println(Double.parseDouble("-Infinity"));
    System.out.println(Double.parseDouble("Infinity"));
    System.out.println(Double.parseDouble("NaN"));
    System.out.println(1.0/0);
    System.out.println(-1.0/0);
    System.out.println(0.0/0);
  }
}
