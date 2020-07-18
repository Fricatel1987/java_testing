package ru.stqa.testing.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.fail;

public class ApplicationManager {
  protected WebDriver driver;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private SessionHelper sessionHelper;
  private StringBuffer verificationErrors = new StringBuffer();

  public void init() {
    System.setProperty("webdriver.gecko.driver", "H:\\QA\\geckodriver-v0.26.0-win64\\geckodriver.exe");
    driver = new FirefoxDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://localhost/addressbook/group.php");
    groupHelper = new GroupHelper(driver);
    navigationHelper = new NavigationHelper(driver);
    sessionHelper = new SessionHelper(driver);
    sessionHelper.login("admin", "secret");
  }

  public void stop() {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
