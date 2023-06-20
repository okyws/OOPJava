package parents;

public class Person {
  String name;
  String address;

  // Constructor Default
  Person() {
    super();
  }

  // Constructor dengan parameter
  Person(String name, String address) {
    super();
    this.name = name;
    this.address = address;
  }

  // method
  void greeting() {
    System.out.println("Hello my name is " + name + ".");
    System.out.println("I, come from " + address + ".");
  }

}
