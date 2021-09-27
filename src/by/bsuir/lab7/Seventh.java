package by.bsuir.lab7;

public class Seventh {

   public static void main(String[] args) {
      int[] array = {1,4,6,3,7,9,3,2,5,7,8};
      shellSort(array);
      for (int i = 0; i < array.length; i++) {
         System.out.print(array[i] +",");
      }
   }


   static void shellSort(int mass[])
   {
      int i, j, step;
      int buffer;
      for (step = mass.length / 2; step > 0; step /= 2)
         for (i = step; i < mass.length; i++)
         {
            buffer = mass[i];
            for (j = i; j >= step; j -= step)
            {
               if (buffer < mass[j - step])
                  mass[j] = mass[j - step];
               else
                  break;
            }
            mass[j] = buffer;
         }
   }
}
