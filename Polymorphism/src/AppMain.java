public class AppMain {
  public static void main(String[] args) {
    Person person1 = new Programmer("Oky", "Bandung", "Java");
    person1.greeting();

    /*
     * Implementasi Polymorphism
     *
     * koding berikut tidak akan bisa berjalan untuk mengakses technology
     * System.out.println(person1.technology);
     *
     * solusinya
     * System.out.println(((Programmer) person1).technology);
     *
     */
    System.out.println(((Programmer) person1).technology);
  }
}
