import childs.Doctor;
import childs.Programmer;
import childs.Teacher;
import parents.Person;

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
    System.out.println(((Programmer) person1).getTechnology());
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
      message = "Hello, " + programmer.getName() + ". Seorang Programmer " + programmer.getTechnology() + ".";
    } else if (person instanceof Teacher) {
      Teacher teacher = (Teacher) person;
      message = "Hello, " + teacher.getName() + ". Seorang Guru " + teacher.getSubject() + ".";
    } else if (person instanceof Doctor) {
      Doctor doctor = (Doctor) person;
      message = "Hello, " + doctor.getName() + ". Seorang Dokter " + doctor.getSpecialist() + ".";
    } else {
      message = "Hello, " + person.getName() + ".";
    }
    System.out.println(message);
  }
}
