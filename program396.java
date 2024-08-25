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

class Queue //FIFO
{
    public node First;
    public int iCount;

    public Queue()
    {
        System.out.println("Object of Queue gets created successfully");
        
        First = null;
        iCount = 0;
    }

    public void Enqueue(int No)    // InsertLast
    {
        node newn = new node(No);

        if(First == null)
        {
            First = newn;
        }
        else
        {
            node temp = First;

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
        }
        iCount++;
    }

    public int Dequeue()        // deleteFirst
    {
        int iValue = 0;

        if(First == null)
        {
            System.out.println("Queue is empty");
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
        System.out.println("Queue of stack are : ");

        node temp = First;

        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    public int Count()
    {
        return iCount;
    }
}

class program396
{
    public static void main(String Arg[])
    {
        Queue obj = new Queue();
        int iRet = 0;

        obj.Enqueue(10);
        obj.Enqueue(20);
        obj.Enqueue(30);
        obj.Enqueue(40);

        obj.Display();

        iRet = obj.Dequeue();
        System.out.println("Poped elements is : "+iRet);

        obj.Display();
    }
}