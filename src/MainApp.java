import parents.Person;

public class MainApp {

  public static void main(String[] args) {
    Person person1 = new Person();
    person1.name = "Oky";
    person1.address = "Bandung";

    System.out.println(person1.name);
    System.out.println(person1.address);
    System.out.println(person1.country);

    person1.sayHello("Padepokan 79");
    System.out.println(person1.sayAddress());

    // only method
    System.out.println();
    Person person2 = new Person();
    person2.sayHello("Padepokan 79");
    System.out.println();

    // membuat object dari class Person menggunakan Contructor Parameter
    Person person3 = new Person("Wahyu", "Bali");
    person3.sayHello("Padepokan 79");
    System.out.println(person3.sayAddress());
    System.out.println();

    // membuat object dari class Person menggunakan Contructor Default
    System.out.println(person3.name);
    System.out.println(person3.address);
    System.out.println();
    person3.sayHello("Padepokan 79");
    System.out.println(person1.sayAddress());
    System.out.println();

    // membuat object dari class Person menggunakan Contructor satu parameter
    Person person4 = new Person("Andre");
    person4.address = "Jakarta";
    person4.sayHello("Padepokan 79");
    System.out.println(person4.sayAddress());
  }
}
