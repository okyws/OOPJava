package childs;

import parents.Person;

public class Doctor extends Person {
  public String specialist;

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
    super.greeting();
    System.out.println("My occupation is a " + specialist + " Doctor.");
  }

}
