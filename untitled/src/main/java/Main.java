public class Main {
    Object message(){
      return "Hello!";
    }

  public static void main(String[] args) {
    System.out.print(new Main().message());
    System.out.print(new Main2().message());
  }
  Class Main2 extends Main{
    String message(){
      return "World!"
    }
}


