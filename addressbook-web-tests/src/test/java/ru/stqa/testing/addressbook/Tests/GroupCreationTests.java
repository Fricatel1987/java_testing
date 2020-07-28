package ru.stqa.testing.addressbook.Tests;

import org.testng.annotations.Test;
import ru.stqa.testing.addressbook.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreationTests() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("Test1", "Test2", "Test3"));
  }
}
