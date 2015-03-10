import java.util.Scanner;
import java.io.File;

public class WC
{
    public static void main(String[] blargs) throws java.io.FileNotFoundException
    {
        Scanner nameScan = new Scanner(System.in);
        System.out.print("File Name: ");
        File file = new File(nameScan.next());
        Scanner scan = new Scanner(file);
        
        int chars = 0;
        int words = 0;
        int lines = 0;
        
        scan.useDelimiter("");
        while (scan.hasNext())
        {
            String character = scan.next();
            chars++;  
        }
        scan = new Scanner(file);
        System.out.println(chars);        
        
        scan.useDelimiter(" ");
        while (scan.hasNext())
        {
            String word = scan.next();
            words++;
        }
        scan = new Scanner(file);
        System.out.println(words);
        
        scan.useDelimiter("\n");
        while (scan.hasNext())
        {
            String line = scan.next();
            lines++;
        }
        System.out.println(lines);
        
        scan.close();
    }
}
