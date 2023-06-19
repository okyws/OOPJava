public class AppMain {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "Oky";
    person1.address = "Bandung";

    Teacher teacher1 = new Teacher();
    teacher1.name = "Wahyu";
    teacher1.address = "Belitung";
    teacher1.subject = "IPA";

    Doctor doctor1 = new Doctor();
    doctor1.name = "Aji";
    doctor1.address = "Solo";
    doctor1.specialist = "Dentis";

    Programmer programmer1 = new Programmer();
    programmer1.name = "Andika";
    programmer1.address = "Jakarta";
    programmer1.technology = "JAVA";

    // person1.greeting();
    // teacher1.greeting();
    // doctor1.greeting();
    // programmer1.greeting();

    Parent person = new Child("Teacher", "Budi");
    person.greeting();
  }
}
