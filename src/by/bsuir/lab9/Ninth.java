package by.bsuir.lab9;

import by.bsuir.lab9.items.Ball;
import by.bsuir.lab9.items.Basket;

import java.util.ArrayList;
import java.util.Arrays;

public class Ninth {

   public static void main(String[] args) {
      ArrayList<Ball> balls = new ArrayList<>(Arrays.asList(
              new Ball("BLUE", 0.2),
              new Ball("BLACK", 0.3),
              new Ball("RED", 0.1),
              new Ball("BLUE", 0.2),
              new Ball("BLUE", 0.2),
              new Ball("BLUE", 0.15)
      ));

      Basket basket = new Basket(balls);

      int numOfBlueBalls = 0;
      for (Ball ball: basket.balls) {
         if (ball.color.equals("BLUE")){
            numOfBlueBalls++;
         }
      }
      System.out.println("Number of blue balls - " + numOfBlueBalls  + " , Weight of basket: " + basket.weight);
   }
}