package by.bsuir.lab4;

import static java.lang.Math.random;
public class Fourth {

   public static void main(String[] args) {
      int N = 10;
      int[] array = new int[N];
      array = fillArray(array);
   }

   static int[] fillArray(int[] array) {
      for (int i = 0; i < array.length; i++) {
         array[i] = (int) (random() * 100);
         isPrime(array[i], i);
      }
      return array;
   }

   static void isPrime(int value, int i) {
      for (int z = 2; z <= value / 2; z++) {
         int temp = value % z;
         if (temp == 0) {
            return;
         }
      }
      System.out.println("Prime number with index - " + i);
   }
}
