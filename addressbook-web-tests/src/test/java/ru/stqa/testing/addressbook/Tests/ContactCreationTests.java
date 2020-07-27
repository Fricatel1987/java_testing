package ru.stqa.testing.addressbook.Tests;

import org.testng.annotations.Test;
import ru.stqa.testing.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreationTests() throws Exception {
    app.getNavigationHelper().goToMainPage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Art", "Fricatel", "Test1"),true);
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();

  }
}