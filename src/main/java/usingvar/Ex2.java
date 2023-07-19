package usingvar;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.stream.Stream;

//record X(var x) {}

public class Ex2 {
  void doStuff2() throws Throwable {
//    var a = 0, b = 0; // NOPE

    for (var x = 0; x < 3; x++)
      System.out.println(x);
//
    try (var in = new FileReader("");
         var out = new FileWriter("")) {
    }
//
//    try (FileReader in = new FileReader("")) {
//    } catch (var ex) {
//    }

  }
  void doStuff() {
    var x = new int[]{ 1, 2, 3 };
  }
//
//  void doStuff3() {
//    var x = { 1, 2, 3 };
//  }

  void doStuff4(Object[] sa) {}
  void moreStuff() {
    // this syntax was Java's first ever type inferencing!
//    CharSequence [] sa = {"Fred", "Jim"};

    CharSequence [] sa = new CharSequence[]{"Fred", "Jim"};
    doStuff4(sa);
    doStuff4(new String[]{"Fred", "Jim"});
//    var r = new X(99);

    var v = Stream.of("X")
        .map(s -> s.length())
        .mapToInt(x -> x)
        .sum()
        ;

  }
}

