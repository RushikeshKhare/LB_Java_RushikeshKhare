import java.util.*;

class Employee
{
    public int EID;
    public String Ename;
    public String EAddress;
    public int ESalary;

    private static int Counter;

    static
    {
        Counter = 0;
    }

    public Employee(String B, String C, int D)
    {
        this.EID = ++Counter;
        this.Ename = B;
        this.EAddress = C;
        this.ESalary = D;
    }

    void DisplayInfo()
    {
        System.out.println("EID : "+ EID+" Name : "+Ename+" Address : "+EAddress+" Salary : "+ESalary);
    }
}

class MarvellousDBMS
{
    public LinkedList<Employee> lobj;
    
    public MarvellousDBMS()
    {
        System.out.println("Marvellous DBMS started successfully...");
        lobj = new LinkedList<Employee>();
    }

    // Insert into Employee values(1,"Sagar", "Pune", 11000);
    public void InsertIntoTable(String name, String Address, int Salary)
    {
        Employee eobj = new Employee(name, Address, Salary);
        lobj.add(eobj); // Addition eobj in LinkedList
    }
}

class program615
{
    public static void main(String Arg[])
    {
        System.out.println("------------ Marvellous Database Management System ------------");

        MarvellousDBMS mobj = new MarvellousDBMS();

        mobj.InsertIntoTable("Sagar Kulkarni","Karve Road Pune 4", 11000);
        mobj.InsertIntoTable("Gaurav Sharma","SB Road Nashik",21000);
        mobj.InsertIntoTable("Chinmayee Patil","LB Road Mumbai",20000);
        mobj.InsertIntoTable("Akash Sudame","FC Road Satara",25000);
        mobj.InsertIntoTable("Mansi Joshi","Panchavati Nashik",12000);
    }
}