package ru.stqa.pft.sandbox;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Functions {
  public static void main (String[] args) {
   hello("Svjat");
   hello("user");
   hello("all");

   Square i = new Square(5);

    System.out.println("Площадь квадрата со стороной " + i.a + " = " + i.area());


    Rectangle r = new Rectangle(4,6);
    System.out.println("Площадь прямоугольника со сторонами " + r.c + " и " + r.d + " = " + r.area());


  }
  public static void hello(String somebody) {

    System.out.println("Hello, " + somebody);
  }



}
