import java.util.Arrays;
import java.util.Random;

public class CommonMethods {

      private static Random random = new Random();
      private static double startCountdown;
      private static double finishCountDown;

      public static int[] fillArray(int count) {
            int[] array = new int[count];
            for (int i=0; i<count; i++){
                array[i] = random.nextInt(1000);
            }
            System.out.println(Arrays.toString(array));
            return array;
      }

      public static void  startCountdown () {
          startCountdown = System.nanoTime();
          System.out.println("Start of action " + startCountdown);
      }

      public static void finishCountdown () {
          finishCountDown = System.nanoTime();
          System.out.println("Finish of action " + finishCountDown  + " Difference:");
          System.err.println(finishCountDown - startCountdown);
      }


}


