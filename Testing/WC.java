import java.util.Scanner;
import java.io.File;

public class WC
{
    public static void main(String[] blargs)
    {
        Scanner nameScan = new Scanner(System.in);
        File file = new File(nameScan.next());
        Scanner scan = new Scanner(file);
        
        int chars = 0;
        int words = 0;
        int lines = 0;
        
        while (scan.hasNext())
        {
            if (scan.hasNextChar())
            {
                chars++;
            }
            else if (scan.hasNext())
            {
                
            }
            
        }
    }
}
