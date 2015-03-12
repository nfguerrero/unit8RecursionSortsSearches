public class StringReverse
{
    public static String reverse(String text)
    {
        if (text.length() <= 1)
        {
            return text;
        }
        
        char c = text.charAt(0);
        String rest = text.substring(1);
        String reversed = reverse(rest) + c;
        return reversed;
    }
    
    public static void main(String[] blargs)
    {
        System.out.println(reverse("Martin and the Dragon!"));
    }
}
