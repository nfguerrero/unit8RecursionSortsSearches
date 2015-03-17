import java.util.*;

public class ListMethods
{
   public static ArrayList<Integer> makeList(int n)
   {
      ArrayList<Integer> tempList = new ArrayList<Integer>(n);
      if (n <= 0)  // The smallest list we can make
      {
          return tempList;
      }
      else        // All other size lists are created here
      {
          tempList = makeList(n-1);
          tempList.add(n);
          return tempList;
      }
   }
   
   public static ArrayList<Integer> reverseList(ArrayList<Integer> tList) 
   {
       ArrayList<Integer> list = ListMethods.deepClone(tList); 
       if (list.size() <= 1)
       {
          return list;
       }
       else
       {
          Integer num = list.get(list.size()-1);
          list.remove(list.size()-1);
          list = reverseList(list);
          list.add(0, num);
          return list;
       }
   }
   
   public static ArrayList<Integer> deepClone(ArrayList<Integer> tList)
    {
       ArrayList<Integer> list = new ArrayList<Integer>(); 
       for (Integer i : tList)
       {
          list.add(new Integer(i));
       }
       return list;
    }
    
   public static ArrayList<Integer> even(ArrayList<Integer> tList)
   {
       ArrayList<Integer> list = ListMethods.deepClone(tList);
       if (list.size() <= 1)
       {
           return list;
       }
       else
       {
           Integer num = list.get(0);
           list.remove(0);
           list.remove(0);
           list = ListMethods.even(list);
           list.add(0, num);
           return list;
       }
   }
   
   public static ArrayList<Integer> odd(ArrayList<Integer> tList)
   {
       ArrayList<Integer> list = ListMethods.deepClone(tList);
       if (list.size() < 1)
       {
           return list;
       }
       else
       {
           list.remove(0);
           Integer num = list.get(0);
           list.remove(0);
           list = ListMethods.odd(list);
           list.add(0, num);
           return list;
       }
   }
}