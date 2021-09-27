package by.bsuir.lab2;

public class Second {

   public static void main(String[] args) {
      int x = 3, y = -4;

      if (checkPoint(x,y)){
         System.out.println("The point is in the shaded area");
      }else{
         System.out.println("The point isn't in the shaded area");
      }

   }

   static boolean checkPoint(int x, int y){
      if ((x >= -4 && x <= 4) && (y >= 0) && (y <= 5)){
         return true;
      }else return (x >= -6 && x <= 6) && (y >= -3) && (y <= 0);
   }
}
