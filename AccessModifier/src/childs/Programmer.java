import Person;

package childs;

public class Programmer extends Person {
  String technology;

  public Programmer() {

  }

  public Programmer(String name, String address, String technology) {
    super(name, address);
    this.technology = technology;
  }

  void hacking() {
    System.out.println("I can hack a website");
  }

  void coding() {
    System.out.println("I can create appliacation using technology: " + technology + ".");
  }

  void greeting() {
    super.greeting(); // memanggil method greeting dari parent Person class
    System.out.println("My job is a " + technology + " Programmer.");
  }
}
