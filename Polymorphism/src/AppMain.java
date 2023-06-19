public class AppMain {
  public static void main(String[] args) {

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

    Person person1 = new Programmer("Oky", "Bandung", "Java");
    // person1.greeting();
    System.out.println(((Programmer) person1).technology);

    Person person2 = new Teacher("Rizki", "Bogor", "Matematika");
    Person person3 = new Doctor("Ahmad", "Solo", "Pedistrician");

    sayHello(person1);
    sayHello(person2);
    sayHello(person3);
  }

  static void sayHello(Person person) {
    String message;
    if (person instanceof Programmer) {
      Programmer programmer = (Programmer) person;
      message = "Hello, " + programmer.name + ". Seorang Programmer " + programmer.technology + ".";
    } else if (person instanceof Teacher) {
      Teacher teacher = (Teacher) person;
      message = "Hello, " + teacher.name + ". Seorang Guru " + teacher.subject + ".";
    } else if (person instanceof Doctor) {
      Doctor doctor = (Doctor) person;
      message = "Hello, " + doctor.name + ". Seorang Dokter " + doctor.specialist + ".";
    } else {
      message = "Hello, " + person.name + ".";
    }
    System.out.println(message);
  }
}
