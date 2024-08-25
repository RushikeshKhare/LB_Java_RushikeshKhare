class node
{
    public int data;
    public node next;
    public node prev;

    public node(int Value)
    {
        data = Value;
        next = null;
    }
}

class Stack //LIFO
{
    public node First;
    public int iCount;

    public Stack()
    {
        System.out.println("Object of Stack gets created successfully");
        
        First = null;
        iCount = 0;
    }

    public void Push(int No)    // Insertfirst
    {
        node newn = new node(No);

        if(First == null)
        {
            First = newn;
        }
        else
        {
            newn.next = First;
            First = newn;
        }
        iCount++;
    }

    public int Pop()        // deleteFirst
    {
        int iValue = 0;

        if(First == null)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else
        {
            iValue = First.data;
            First =First.next;
        }
        iCount--;
        return iValue;
    }

    public void Display()
    {
        System.out.println("Elements of stack are : ");

        node temp = First;

        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int Count()
    {
        return iCount;
    }
}

class program395
{
    public static void main(String Arg[])
    {
        Stack obj = new Stack();
        int iRet = 0;

        obj.Push(10);
        obj.Push(20);
        obj.Push(30);
        obj.Push(40);

        obj.Display();

        iRet = obj.Pop();
        System.out.println("Poped elements is : "+iRet);

        obj.Display();
    }
}