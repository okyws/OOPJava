import interfaces.Phone;

public class PhoneUser {
  private Phone phone;

  public PhoneUser(Phone phone) {
    this.phone = phone;
  }

  public void turnOnPhone() {
    this.phone.powerOn();
  }

  public void turnOffPhone() {
    this.phone.powerOff();
  }

  public void makePhoneLouder() {
    this.phone.volumeUp();
  }

  public void makePhoneSilent() {
    this.phone.volumeDown();
  }

  // getter dan setter
  public Phone getPhone() {
    return this.phone;
  }

  public void setPhone(Phone phone) {
    this.phone = phone;
  }
}
