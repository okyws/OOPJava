package parents;

public class Person {
  public String name;
  public String address;

  // Constructor Default
  public Person() {
    super();
  }

  // Constructor dengan parameter
  public Person(String name, String address) {
    super();
    this.name = name;
    this.address = address;
  }

  // method
  public void greeting() {
    System.out.println("Hello my name is " + name + ".");
    System.out.println("I, come from " + address + ".");
  }

}
