import java.util.*;

class program254
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your name : ");
        String name = sobj.nextLine();

        int i = 0, iCnt = 0;
        char ch;
        
        for(i = 0; i < name.length(); i++)
        {
            ch = name.charAt(i);

            if((ch >= 'A') && (ch <= 'Z'))
            {
                iCnt++;
            }
        }

        System.out.println("Capital characters are : "+iCnt);
    }
}