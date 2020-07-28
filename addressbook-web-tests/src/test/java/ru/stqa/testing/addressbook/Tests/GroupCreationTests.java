package ru.stqa.testing.addressbook.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.testing.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreationTests() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createGroup(new GroupData("Test1", "Test2", "Test3"));
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before +1);
  }
}
