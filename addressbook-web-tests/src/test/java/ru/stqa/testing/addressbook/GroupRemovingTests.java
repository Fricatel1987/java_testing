package ru.stqa.testing.addressbook;

import org.testng.annotations.Test;

public class GroupRemovingTests extends TestBase {

  @Test
  public void testGroupRemovingTests() throws Exception {
    gotoGroupPage();
    selectGroup();
    deleteSelectedGroups();
    returnToGroupPage();
  }
}