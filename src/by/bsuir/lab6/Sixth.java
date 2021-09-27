package by.bsuir.lab6;

import static java.lang.Math.random;

public class Sixth {

   public static void main(String[] args) {
      int N = 10;
      int[] array = new int[N];
      array = fillArray(array);

      int[][] finalMatrix = new int[N][N];
      fillMatrix(array, finalMatrix);
   }

   static int[] fillArray(int[] array) {
      for (int i = 0; i < array.length; i++) {
         array[i] = (int) (random() * 100);
      }
      return array;
   }

   static int[][] fillMatrix(int[] array, int[][] matrix) {
      int startIndex = 0;
      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix[i].length; j++) {
            matrix[i][j] = array[startIndex];
            if (startIndex == 9){
               startIndex = 0;
            }else{
               startIndex++;
            }
            System.out.print(matrix[i][j] + " ");
         }
         startIndex = i + 1;
         System.out.println();
      }
      return matrix;
   }
}
