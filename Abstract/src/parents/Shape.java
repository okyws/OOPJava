package parents;

public abstract class Shape {
  private String color;

  public Shape() {

  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  // abstarct method get area
  public abstract double getArea();
}
