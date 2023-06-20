package interfaces;

public interface Phone {
  /*
   * secara default interface menggunakan access modifier
   * public, jadi kita tida perlu menuliskan kata kunci public lagi
   */
  // constant file / attribute
  int MAX_VOLUME = 100;
  int MIN_VOLUME = 0;

  // abstract method
  void powerOn();

  void powerOff();

  void volumeUp();

  void volumeDown();
}
