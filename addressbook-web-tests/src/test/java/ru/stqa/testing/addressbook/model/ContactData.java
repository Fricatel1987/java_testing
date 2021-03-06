package ru.stqa.testing.addressbook.model;

public class ContactData {
  private final String firstName;
  private final String lastName;
  private final String group;


  public ContactData(String firstName, String lastName, String group) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.group = group;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getGroup() { return group; }
}