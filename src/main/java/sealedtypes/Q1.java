package sealedtypes;

public class Q1 {
}

interface ArbInter {}
final class Y implements X {}
sealed interface X /* point x */{}
  // line n1
//non-sealed class Z implements X permits Q {}
//final class Q implements Z {}
