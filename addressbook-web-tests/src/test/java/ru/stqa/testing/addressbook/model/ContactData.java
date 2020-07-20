package ru.stqa.testing.addressbook.model;

public class ContactData {
  private final String firstName;
  private final String lastName;
  private final String address;
  private final String home;
  private final String email;
  private final String address2;
  private final String phone2;

  public ContactData(String firstName, String lastName, String address, String home, String email, String address2, String phone2) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.home = home;
    this.email = email;
    this.address2 = address2;
    this.phone2 = phone2;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getAddress() {
    return address;
  }

  public String getHome() {
    return home;
  }

  public String getEmail() {
    return email;
  }

  public String getAddress2() {
    return address2;
  }

  public String getPhone2() {
    return phone2;
  }
}