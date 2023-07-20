package methods;

class Parent {
  public long getBigValue() {
    return 1;
  }

  public int getValue() {
    return 1;
  }

  public CharSequence getText() {
    return null;
  }
}

public class OverloadOverride extends Parent {
//    public int getBigValue() {return 1;}

  //    public int getValue(int x) {return 1;}
//    public String getValue() {return "Hello";}
//    public String getValue(int x) {return "Hello";}
  public StringBuilder getText() {
    return null;
  }
//    public Object getText() { return ""; }

  public static void main(String[] args) {
    int x = 10;
    long l = x;
  }
}
