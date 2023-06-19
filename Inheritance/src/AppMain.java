public class AppMain {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "Oky";
    person1.address = "Bandung";

    Teacher teacher1 = new Teacher();
    teacher1.name = "Wahyu";
    teacher1.address = "Belitung";
    teacher1.subject = "IPA";

    Programmer programmer1 = new Programmer();
    programmer1.name = "Andika";
    programmer1.address = "Jakarta";
    programmer1.technology = "JAVA";

    // object Doctor menggunakan constructor default
    Doctor doctor1 = new Doctor();
    doctor1.name = "Aji";
    doctor1.address = "Solo";
    doctor1.specialist = "Dentis";

    // object Doctor menggunakan constructor berparameter
    Doctor doctor2 = new Doctor("Danu", "Tangerang", "Cardiologist");
    doctor2.greeting();
    System.out.println();

    doctor1.greeting();
    System.out.println();
    person1.greeting();
    System.out.println();
    teacher1.greeting();
    System.out.println();
    programmer1.greeting();
    System.out.println();

    // latihan soal 1
    System.out.println("soal 1");
    Parent person = new Child("Teacher", "Budi");
    person.greeting();
    System.out.println();

    // latihan soal 2
    System.out.println("soal 2");
    Child persons = new Child("Teacher", "Budi");
    persons.greeting();
  }
}
