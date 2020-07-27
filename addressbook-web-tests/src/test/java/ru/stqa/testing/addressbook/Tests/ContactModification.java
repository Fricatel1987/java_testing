package ru.stqa.testing.addressbook.Tests;

import org.testng.annotations.Test;
import ru.stqa.testing.addressbook.model.ContactData;


public class ContactModification extends TestBase {

  @Test
  public void testContactModificationTest() throws Exception {
    app.getNavigationHelper().goToMainPage();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Art", "Fricatel", null),false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
  }

}
