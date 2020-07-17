/*
1. Setup - open browser and application
2. Login
3. Close
 */
import org.testng.annotations.Test;

public class Test2 {

  @Test
  void setup(){
    System.out.println("this is setup test");
  }
  @Test

  void login(){
    System.out.println("this is login test");
  }
  @Test

  void teardown(){
    System.out.println("closing browser");
  }

}
