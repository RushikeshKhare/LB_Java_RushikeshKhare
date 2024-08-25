
import java.util.*;

class program569
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        StringBuffer sb = new StringBuffer(str);

        sb = sb.reverse();

        System.out.println("reverse String is "+sb);
    }
}