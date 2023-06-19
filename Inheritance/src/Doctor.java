public class Doctor extends Person {
  String specialist;

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

  void surgency() {
    System.out.println("I can " + specialist + " operation patients");
  }

  void greeting() {
    super.greeting();
    System.out.println("My occupation is a " + specialist + " Doctor.");
  }

}
