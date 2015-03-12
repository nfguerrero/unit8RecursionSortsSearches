public class StringReverseIter
{
    public static String reverse(String text)
    {
        String reversed = "";
        
        for (int i = text.length()-1; i >=0; i--)
        {
            char c = text.charAt(i);
            reversed += c;
        }
        
        return reversed;
    }
    
    public static void main(String[] blargs)
    {
        System.out.println(reverse("Martin and the Dragon!"));
    }
}