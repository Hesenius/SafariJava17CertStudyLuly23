package sealedtypes;

import java.util.ArrayList;
import java.util.List;

sealed interface Transporter permits Truck, Car, Weird, Bicycle { }

final class BoxVan extends Truck {
  public BoxVan(int payload) {
    super(payload);
  }
}

enum Weird implements Transporter {}

sealed class Truck implements Transporter /*permits BoxVan*/ {
//non-sealed class Truck implements Transporter {
//final class Truck implements Transporter {
  private int payload;

  public Truck(int payload) {
    this.payload = payload;
  }

  public int getPayload() {
    return payload;
  }

  @Override
  public String toString() {
    return "Truck{" +
        "payload=" + payload +
        '}';
  }
}

record Car(int seats) implements Transporter { }

// permits is nonsense for anything other than "sealed"
non-sealed class Bicycle implements Transporter /*permits Chopper*/ { }

final class Chopper extends Bicycle {}

public class Logistics {
  public static boolean canCarry(Transporter t, int payload) {
    boolean canCarry = true;
    if (t instanceof Truck truck) canCarry =  ((Truck) t).getPayload() >= payload;
    if (t instanceof Car c) canCarry = (c.seats() - 1) * 170 > payload;
    return canCarry;
  }

  public static void main(String[] args) {
    List<Transporter> ts = List.of(
        new Truck(5_000),
        new Car(5),
        new Bicycle()
    );
    int packageWeight = 1500;
    for (Transporter t : ts) {
      System.out.println(t + " can" +
          (canCarry(t, packageWeight) ? "" : "'t")
          + " carry that package");
    }

//    int goto = 99;
//    int assert = 99;
//    int const = 99;
    var var = "var"; // YEP!
    var sealed = "var"; // YEP!
  }
}

//class var {} // NOPE!!!