import java.util.Scanner;

import interfaces.Phone;

public class MainApp {
  public static void main(String[] args) {
    // membuat object phone menggunakan instansiasi dari class Xiaomi
    Phone redmiNote10 = new Xiaomi();

    // membuat object phoneUser
    PhoneUser oky = new PhoneUser(redmiNote10);

    // nyalakan hp
    oky.turnOnPhone();

    // membuat tampilan
    Scanner input = new Scanner(System.in);
    String aksi;
    boolean isLooping = true;

    do {
      System.out.println("====Aplikasi Innterface====");
      System.out.println("[1] Menyalakan hp");
      System.out.println("[2] Mematikan hp");
      System.out.println("[3] Perbesar Volume");
      System.out.println("[4] Perkecil Volume");
      System.out.println("[0] Keluar");
      System.out.println("===========================");

      System.out.println("Pilih Aksi: ");
      aksi = input.next();

      if (aksi.equalsIgnoreCase("1")) {
        oky.turnOnPhone();
      } else if (aksi.equalsIgnoreCase("2")) {
        oky.turnOffPhone();
      } else if (aksi.equalsIgnoreCase("3")) {
        oky.makePhoneLouder();
      } else if (aksi.equalsIgnoreCase("4")) {
        oky.makePhoneSilent();
      } else if (aksi.equalsIgnoreCase("0")) {
        isLooping = false;
      } else {
        System.out.println("Aksi yang di pilih tidak tersedia.");
        System.out.println("silahkan pilih kembali.");
      }
    } while (isLooping);
  }
}
