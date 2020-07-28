package ru.stqa.testing.addressbook.Tests;

import org.testng.annotations.Test;
import ru.stqa.testing.addressbook.model.GroupData;

public class GroupRemovingTests extends TestBase {

  @Test
  public void testGroupRemovingTests() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    if (!app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("Test1", null, null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }
}