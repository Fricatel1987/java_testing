package ru.stqa.testing.sandox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Artur");


    Square s = new Square(5);
    System.out.println("Площадь квадрата sо sтороной " + s.l + " = " + area(s));

    Rectangle r = new Rectangle(4,6);
       System.out.println("Площадь прaмоугольника sо sторонами " + r.a + " и " + r.b + " = " + area(r));

  }
  public static void hello(String somebody){
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area (Square s){
    return s.l * s.l;
  }

  public static double area (Rectangle r) {
    return r.a * r.b;
  }

  public static double area (double l) {
    return l * l;
  }

}

