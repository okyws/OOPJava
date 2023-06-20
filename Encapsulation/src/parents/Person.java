package parents;

public class Person {
  private String name;
  private String address;

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

  // setter dan getter
  public String getName() {
    return this.name;
  }

  public void getName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return this.address;
  }

  public void getAddress(String address) {
    this.address = address;
  }

}
