import childs.Doctor;
import childs.Programmer;
import childs.Teacher;
import parents.Person;

public class AppMain {
  public static void main(String[] args) {

    /*
     * Implementasi Encapsulation
     * Encapsulation adalah teknik yang menggunakan setter dan getter
     *
     * membuat object Encapsulation
     * Person person = new Person();
     *
     * kode yang salah jika menggunakan encapsulation
     * person.name = "Oky";
     * System.out.println(person.name);
     * System.out.println(((Programmer) person1).technology);
     *
     * kode yang benar ketika menggunakan encapsulation
     * person.setName("Oky");
     * person.setAddress("Bandung")
     * System.out.println(person.getName());
     * System.out.println(((Programmer) person1).getTechnology());
     *
     */

    Person person1 = new Programmer("Oky", "Bandung", "Java");
    // person1.greeting();

    // contoh cara pemanggilan encapsulation
    System.out.println(((Programmer) person1).getTechnology() + "\n");
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
      message = "Hello, " + programmer.getName() + ". Seorang Programmer " + programmer.getTechnology() + ".\n";
      programmer.greeting();
    } else if (person instanceof Teacher) {
      Teacher teacher = (Teacher) person;
      message = "Hello, " + teacher.getName() + ". Seorang Guru " + teacher.getSubject() + ".\n";
      teacher.greeting();
    } else if (person instanceof Doctor) {
      Doctor doctor = (Doctor) person;
      message = "Hello, " + doctor.getName() + ". Seorang Dokter " + doctor.getSpecialist() + ".\n";
      doctor.greeting();
    } else {
      message = "Hello, " + person.getName() + ".\n";
      person.greeting();
    }
    System.out.println(message);
  }
}
