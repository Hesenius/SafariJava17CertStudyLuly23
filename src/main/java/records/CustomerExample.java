package records;

import enumstuff.Ex;

import java.io.Serializable;

// parens here declare the "components"
// components will be copied from the actual params of the constructor
// canonical constructor is created by default to perform the initialization
// private final fields are created to store the component values
// accessor methods, which declare NO EXCEPTIONS, are created to access
//   the fields directly
// NO mutators are provided
// automatic equals, hashCode, and toString based on the components
// can't say extends, and can't extend a record
record Customer(String name, int id/*, String... stuff*/) implements Serializable/*extends java.lang.Record*/ {
  // line n1

//  final int x = 0; // CANNOT declare instance fields
//    {} // NOPE, similarly, cannot declare instance intializers
  static/* final */int MAX_CREDIT = 12000;
  static {}
  static int getMaxCredit() { return MAX_CREDIT; }

  // can "override" the auto-built stuff
  @Override // Not really an "override" but a replacment
  public String toString() {
//    return "I'm a customer " + super.toString();
    return "I'm a customer " + this.name;
  }

  @Override
  public String name() /*throws Exception*/ {
    return "My name is " + name;
  }

  // if you provide ZERO "constructor like stuff"
  // you get the "canonical constructor"
  // you CAN define the canonical constructor yourself if you want
  // formal param names MUST MATCH the component names!!!
//  Customer(String name, int id) {
//    if (name == null || name.length() == 0 || id < 0)
//      throw new IllegalArgumentException();
//    this.name = name; // IF you declare the canonical constructor
//    this.id = id; // YOU MUST initialize the fields
//  }

  // normally, don't define a Canonical constructor, define a
  // compact constructor (this amounts to "preamble"):
  Customer {
    if (name == null || name.length() == 0 || id < 0)
      throw new IllegalArgumentException();
//    System.out.println(this.name); // NO, uninitialized
//    this.name = "Mr" + name; // NO, causes attempt at double initialization
  } // Now, this code "runs into" the canonical constructor
}

record DoesItBreak(StringBuilder sb) {}

public class CustomerExample {
  public static void main(String[] args) {
    Customer c1 = new Customer("Fred", 1234);
    Customer c2 = new Customer("Fred", 1234);
    Customer c3 = new Customer("Albert", 1234);

    System.out.println("c1 is " + c1);
    System.out.println("c1.equals(c2) " + c1.equals(c2));
    System.out.println(c1.name());

    StringBuilder sb = new StringBuilder("Hello");
    DoesItBreak dib = new DoesItBreak(sb);
    System.out.println(dib);
    sb.append(" World!");
    System.out.println(dib);
//    var s = c1.stuff();
  }
}
