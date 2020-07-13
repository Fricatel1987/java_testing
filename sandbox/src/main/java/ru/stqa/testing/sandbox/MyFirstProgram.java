package ru.stqa.testing.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Artur");


    Square s = new Square(5);
    System.out.println("Площадь квадрата sо sтороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,6);
       System.out.println("Площадь прaмоугольника sо sторонами " + r.a + " и " + r.b + " = " + r.area());

  }
  public static void hello(String somebody){
    System.out.println("Hello, " + somebody + "!");
  }



  public static double area (double l) {
    return l * l;
  }

}

