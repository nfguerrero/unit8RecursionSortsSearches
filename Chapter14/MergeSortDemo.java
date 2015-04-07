import java.util.Arrays;

/**
   This program demonstrates the merge sort algorithm by
   sorting an array that is filled with random numbers.
*/
public class MergeSortDemo
{  
   public static void main(String[] args)
   {  
      int[] a = ArrayUtil.randomIntArray(20, 100);
      System.out.println(Arrays.toString(a));

      MergeSorter.sort(a);

      System.out.println(Arrays.toString(a));
      
      //String sort
      System.out.println();
      
      //String[] b = ArrayUtil.randomStringArray(20, 100);
      String[] b = ArrayUtil.stringArray();
      System.out.println(Arrays.toString(b));
      
      MergeSorter.sort(b);
      
      System.out.println(Arrays.toString(b));
   }
}

