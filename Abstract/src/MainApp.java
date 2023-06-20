import childs.Item;
import parents.Product;

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
   */
  // Product product1 = new Product(); // salah
  Product product2 = new Item(); // benar
}
