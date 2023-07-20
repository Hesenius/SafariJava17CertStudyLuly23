package enumstuff;

enum Suit {
  HEARTS() {
//    @Override
//    boolean isTrumps() {
//      return true;
//    }
  }, DIAMONDS, CLUBS, SPADES;
  final boolean isTrumps() { return this == HEARTS; }
}

//enum Blah extends Suit {} // nope! enums cannot say extends
// nor can the be mentioned in "extends"
public class Ex {
  public static void main(String[] args) {
//    boolean b = Suit.HEARTS.isTrumps();
    boolean b = Suit.CLUBS.isTrumps();
    System.out.println(b);
    Suit.values();
  }
}
