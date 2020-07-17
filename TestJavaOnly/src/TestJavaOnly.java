import org.testng.annotations.Test;

public class TestJavaOnly {

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
