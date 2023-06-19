public class Child extends Parent {
  public String occupation;

  public Child(String occupation, String name) {
    super(name);
    this.occupation = occupation;
  }

  public void greeting() {
    super.greeting();
    System.out.println("My occupation is " + occupation);
  }
}
