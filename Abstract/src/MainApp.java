import childs.Circle;
import childs.Triangle;
import parents.Shape;

public class MainApp {
  /*
   * Tidak dapat langsung di inisiasi menjadi object karena class
   * produk adalah abstrak
   *
   * Product product1 = new Product();
   *
   *
   * untuk cara inisiasinya adalah seperti ini
   *
   * Product product2 = new Item();
   * dengan kode diataskita dapat membuat objectproduct dari
   * instansiasi child class Item
   *
   *
   * Product product1 = new Product(); // salah
   * Product product2 = new Item(); // benar
   */

  public static void main(String[] args) {
    Shape lingkaran = new Circle("Merah", 20);
    Shape segitiga = new Triangle(10, 15, "Putih");

    System.out.println("Luas lingkaran berwarna " + lingkaran.getColor() + " adalah " + lingkaran.getArea());
    System.out.println("Luas segitiga berwarna " + segitiga.getColor() + " adalah " + segitiga.getArea());
  }
}
