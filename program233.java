import java.util.*;

class ArrayX
{
    public int Arr[];

    public ArrayX(int no)
    {
        Arr = new int[no];
    }
}

class program233
{
    public static void main (String Arg[])
    {
        ArrayX aobj = new ArrayX(5);

        System.out.println("Array size is :"+ aobj.Arr.length);
    }
}