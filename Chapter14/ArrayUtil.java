import java.util.Random;

/**
   This class contains utility methods for array manipulation.
*/  
public class ArrayUtil
{ 
   private static Random generator = new Random();

   /**
      Creates an array filled with random values.
      @param length the length of the array
      @param n the number of possible random values
      @return an array filled with length numbers between
      0 and n - 1
   */
   public static int[] randomIntArray(int length, int n)
   {  
      int[] a = new int[length];      
      for (int i = 0; i < a.length; i++)
      {
         a[i] = generator.nextInt(n);
      }
      
      return a;
   }
   
   public static String[] randomStringArray(int length, int n)
   {
       String[] a = new String[length];
       for (int i = 0; i < a.length; i++)
       {
           a[i] = "" + generator.nextInt(n);
       }
       
       return a;
   }
   
   public static String[] stringArray()
   {
       String[] a = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
       
       return a;
   }

   /**
      Swaps two entries of an array.
      @param a the array
      @param i the first position to swap
      @param j the second position to swap
   */
   public static void swap(int[] a, int i, int j)
   {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
   }
}
      
