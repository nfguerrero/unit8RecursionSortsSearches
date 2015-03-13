import java.util.ArrayList;

public class ListMethodsRunner
{
   public static void main(String[] args)
   {
      ArrayList<Integer> tempList = ListMethods.makeList(100);
      if (tempList.size() == 0)
      {
          System.out.println("The list is empty");
      }
      else
      {
         for (Integer i : tempList)
         {
            System.out.println(i);
         }
         System.out.println("Reversed:");
         for (Integer i : ListMethods.reverseList(tempList))
         {
             System.out.println(i);
         }
         System.out.println("Even:");
         for (Integer i : ListMethods.even(tempList))
         {
             System.out.println(i);
         }
      }
   }
}