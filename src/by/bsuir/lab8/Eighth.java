package by.bsuir.lab8;

public class Eighth {

   public static void main(String[] args) {
      int[] mas = {1, 5, 7, 12, 16, 18, 27, 37, 48};
      int[] mas1 = {2, 6, 17, 23, 24, 30, 48, 57, 64};
      for (int x = 0; x < mas.length; x++) {
         System.out.print(mas[x] + " ");
      }
      System.out.println();
      for (int x = 0; x < mas1.length; x++) {
         System.out.print(mas1[x] + " ");
      }
      System.out.println();
      int count = 0;
      for (int x = 0; x < mas.length; x++) {
         if (mas1[count] < mas[x]) {
            System.out.print("<" + mas1[count] + "> ");
            count++;
            x--;
         } else
            System.out.print(mas[x] + " ");
      }
      if (count < mas1.length) {
         for (int x = count; x < mas1.length; x++) {
            System.out.print("<" + mas1[x] + "> ");
         }
      }
   }
}
