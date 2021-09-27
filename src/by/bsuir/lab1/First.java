package by.bsuir.lab1;

import static java.lang.Math.*;

public class First {

   public static void main(String[] args) {
      double x = 1, y = 2;

      double numerator = calculateNumerator(x, y);
      double denominator = calculateDenominator(x, y);
      double result = (numerator / denominator) + x;

      System.out.println("Result: " + result);
   }

   static double calculateNumerator(double x, double y){
      return 1 + pow(sin(x + y),2);
   }

   static double calculateDenominator(double x, double y){
      return 2 + abs(x - ((2 * x) / (1 + pow(x,2)*pow(y,2))));
   }
}
