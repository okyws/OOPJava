
public class Person {
  String name;
  String address;
  final String country = "Indonesia";

  // Constructor Default
  Person() {

  }

  // Constructor dengan satu parameter
  Person(String paramName) {
    name = paramName;
  }

  // Variable Shadowing
  Person(String name, String address) {
    // penamaan field dan parameter yang sama mengakibatkan terjadinya variable
    // shadowing
    // field nama tidak akan berubah name = name;
    // field address tidak akan berubah address = address;

    // cara mengatasinya dengan memakai keyword this
    // this.name menunjukan field dari kelas itu sendiri
    this.name = name;
    this.address = address;
  }

  // method with value
  void sayHello(String paramName) {
    System.out.println("Hello " + paramName + ", My name is " + name + ".");
  }

  // method return value
  String sayAddress() {
    return "I, come from " + address + ".";
  }
}
