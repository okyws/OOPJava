public class Parent {
  public String name;

  public Parent() {
  }

  public Parent(String name) {
    this.name = name;
  }

  public void greeting() {
    System.out.println("Hallo, my name is " + name);
  }
}
