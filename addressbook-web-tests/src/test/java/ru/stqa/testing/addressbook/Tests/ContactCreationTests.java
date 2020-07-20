package ru.stqa.testing.addressbook.Tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import ru.stqa.testing.addressbook.model.ContactData;

import static org.testng.Assert.fail;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreationTests() throws Exception {
    app.getNavigationHelper().goToMainPage();
    app.getNavigationHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData(
                    "Albert",
                    "Fricatel",
                    "London",
                    "0987654321",
                    "UK@gmail.com",
                    "overthere",
                    "overthere"));

    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returnToHomePage();

  }
}