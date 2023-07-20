package methods;

public class OverloadResolution {
//  void doStuff(int x, int y) {}         // Method A
  void doStuff(int x, long y) {}        // Method B
  void doStuff(long x, int y) {}        // Method C
  void doStuff(int ... x) {}            // Method D
  void doStuff(Integer x, Integer y) {} // Method E
  void doStuff(Integer x, Number y) {}
  void doStuff(Number x, Integer y) {}

  void tryStuff() {
//    Object l = 9;
    doStuff(1L, 2);
  }
}
