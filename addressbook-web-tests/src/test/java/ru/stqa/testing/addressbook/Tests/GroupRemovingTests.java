package ru.stqa.testing.addressbook.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.testing.addressbook.model.GroupData;

public class GroupRemovingTests extends TestBase {

  @Test
  public void testGroupRemovingTests() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    if (!app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("Test1", null, null));
    }
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before -1);
  }
}