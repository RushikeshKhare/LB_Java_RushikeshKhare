// string is immutable here
import java.util.*;

class program568
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        System.out.println("Enter the word that you want to search: ");
        String word = sobj.nextLine();

        str = str.reverse();

        System.out.println("reverse String is "+str);
    }
}