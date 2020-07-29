package ru.stqa.testing.addressbook.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.testing.addressbook.model.GroupData;

import java.util.List;

public class GroupRemovingTests extends TestBase {

  @Test
  public void testGroupRemovingTests() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    if (!app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("Test1", null, null));
    }
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().selectGroup(before.size() - 1);
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() -1);
  }
}