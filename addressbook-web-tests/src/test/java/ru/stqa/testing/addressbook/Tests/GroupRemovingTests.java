package ru.stqa.testing.addressbook.Tests;

import org.testng.annotations.Test;

public class GroupRemovingTests extends TestBase {

  @Test
  public void testGroupRemovingTests() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }
}