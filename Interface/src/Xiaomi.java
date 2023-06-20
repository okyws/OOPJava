import interfaces.Phone;

public class Xiaomi implements Phone {
  private int volume;
  private boolean isPowerOn;

  public Xiaomi() {
    // set volume awal / default
    this.volume = 50;
  }

  // override semua method abstact yang ada di interfaces Phone
  @Override
  public void powerOn() {
    isPowerOn = true;
    System.out.println("Handphone menyala...");
    System.out.println("Selamat datang di Xiaomi");
    System.out.println("Android 10");
  }

  @Override
  public void powerOff() {
    isPowerOn = false;
    System.out.println("Mematikan Handphone");
  }

  @Override
  public void volumeUp() {
    if (isPowerOn) {
      if (this.volume == MAX_VOLUME) {
        System.out.println("Volume sudah maksimal!!!");
        System.out.println("Volume = " + this.volume + "%");
      } else {
        this.volume += 10;
        System.out.println("volume sekarang " + this.volume + "%");
      }
    } else {
      System.out.println("Handphone mati, silahkan nyalakan terlebih dahulu!!!");
    }
  }

  @Override
  public void volumeDown() {
    if (isPowerOn) {
      if (this.volume == MIN_VOLUME) {
        System.out.println("Volume = " + this.volume + "%");
      } else {
        this.volume -= 10;
        System.out.println("volume sekarang " + this.volume + "%");
      }
    } else {
      System.out.println("Handphone mati, silahkan nyalakan terlebih dahulu!!!");
    }
  }

  // getter dan setter
  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public boolean isPowerOn() {
    return isPowerOn;
  }

  public void setPowerOn(boolean isPowerOn) {
    this.isPowerOn = isPowerOn;
  }
}
