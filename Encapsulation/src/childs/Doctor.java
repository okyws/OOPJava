package childs;

import parents.Person;

public class Doctor extends Person {
  private String specialist;

  public Doctor() {
    /*
     * meskipun kita kita menuliskan " super(); " tetapi java sudah menyediakannya
     * secara default meski kita tidak memanggilnya
     */
  }

  public Doctor(String name, String address, String specialist) {
    /*
     * short code:
     * super(name, address);
     *
     * alternatif cara penggunaan super constructor
     * super();
     * super.name = name;
     * super.address = address;
     */

    super(name, address);
    this.specialist = specialist;
  }

  public void surgency() {
    System.out.println("I can " + specialist + " operation patients");
  }

  public void greeting() {
    System.out.println("Hello my name is " + getName() + ".");
    System.out.println("I, come from " + getAddress() + ".");
    System.out.println("My occupation is a " + specialist + " Doctor.");
  }

  public String getSpecialist() {
    return this.specialist;
  }

  public void setSpecialist(String specialist) {
    this.specialist = specialist;
  }

}
