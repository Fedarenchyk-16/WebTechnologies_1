package by.bsuir.lab3;

import static java.lang.Math.tan;
public class Third {

   public static void main(String[] args) {

      double x = 0;
      double y = 100;
      double h = 10;

      for (double i = x; i <= y; i += h) {
         System.out.printf("|\t%4.1f\t|\t%4.3f\t|\n", i , calculateF(i));
      }
   }

   static double calculateF(double value){
      return tan(value);
   }
}
