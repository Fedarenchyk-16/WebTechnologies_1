package by.bsuir.lab5;

public class Fifth {

   public static void main(String[] args) {
      int[] sequence = {1, 8, -8, 0, 5, 7, 10, 4, 9};
      System.out.println("Minimal number of elements: " + getMinMinimalNumOfElements(sequence));
   }

   public static int getMinMinimalNumOfElements(int[] sequence) {
      int maxIncSequenceLength = 0;
      int currentIncSequenceLength;
      boolean isIncrement;

      for (int i = 0; i < sequence.length; i++) {
         isIncrement = true;
         currentIncSequenceLength = 1;
         for (int j = i + 1; (j < sequence.length) && isIncrement; j++) {
            if (sequence[j - 1] < sequence[j]) {
               currentIncSequenceLength++;
            } else {
               isIncrement = false;
            }
         }
         maxIncSequenceLength = Math.max(maxIncSequenceLength, currentIncSequenceLength);
      }
      return sequence.length - maxIncSequenceLength;
   }
}
