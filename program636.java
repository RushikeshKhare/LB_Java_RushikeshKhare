import java.util.*;

class program636
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s+ ", " ");

        String Arr[] = str.split(" ");

        HashMap <String, Integer> hobj = new HashMap<String, Integer>();

        int Frequency = 0;
        for(String A : Arr)
        {
            if(hobj.containsKey(A)) // String is already present
            {
                Frequency = hobj.get(A);
                hobj.put(A, Frequency+1);
            }
            else        // String occurse first time
            {
                hobj.put(A,1);
            }
        }

        System.out.println(hobj);

    }
}

// put(Key, value)
// get(key)
// containsKey(key)