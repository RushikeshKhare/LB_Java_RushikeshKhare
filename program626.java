import java.util.*;

import javax.print.attribute.standard.MediaSize.NA;

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

    // Selet * from employee;
    public void SelectStar()
    {
        System.out.println("Data from the Employee Database :");

        System.out.println("EID\tEname\t\tEAddress\tEsalary");
        for(Employee eref : lobj)
        {
            eref.DisplayInfo();
        }
    }
    // Select * from employee where EID = 4;
    public void SelectSpecific(int ID)
    {
        System.out.println("Information of Employee whose EID is : "+ID);

        for(Employee eref : lobj)
        {
            if(eref.EID == ID)
            {
                eref.DisplayInfo();
                break;
            }
        }
    }

    // Select * from Employee where Ename = "Sagar";
    public void SelectSpecific(String Name)
    {
        System.out.println("Information of Employee whose Name is : "+Name);

        for(Employee eref : lobj)
        {
            if(Name.equals(eref.Ename))
            {
                eref.DisplayInfo();
            }
        }
    }

    //delete from Employee where EID = 3;
    public void DeleteFrom(int ID)
    {
        int index = 0;
        boolean bFlag = false;

        for(Employee eref : lobj)
        {
            if(eref.EID == ID)
            {
                bFlag = true;
                break;
            }
            index++;
        }
        if(bFlag == false)
        {
            System.out.println("Unable to delete the element form database as given ID is not present");
        }
        else
        {
            lobj.remove(index);
        }
    }

    // delete from Employee where Ename = "Sagar";
    public void DeleteFrom(String Name)
    {
        int index = 0;
        boolean bFlag = false;

        for(Employee eref : lobj)
        {
            if(eref.Ename.equals(Name))
            {
                bFlag = true;
                break;
            }
            index++;
        }
        if(bFlag == false)
        {
            System.out.println("Unable to delete the element form database as given ID is not present");
        }
        else
        {
            lobj.remove(index);
        }
    }

    // Selete Sum(ESalary) from Employee;
    public void AggregateSum()
    {
        int iSum = 0;

        for(Employee eref : lobj)
        {
            iSum = iSum + eref.ESalary;
        }
        System.out.println("Summation of salary : "+iSum);
    }

    // Selete Max(ESalary) from Employee;
    public void AggregateMax()
    {
        int iMax = 0;

        for(Employee eref : lobj)
        {
            if(eref.ESalary > iMax)
            {
                iMax = eref.ESalary;
            }
        }
        System.out.println("Maximum salary : "+iMax);
    }

    // Select Min(ESalary) from Employee;
    public void AggregateMin()
    {
        Employee temp = lobj.get(0);

        int iMin = temp.ESalary;

        for(Employee eref : lobj)
        {
            if(eref.ESalary < iMin)
            {
                iMin = eref.ESalary;
            }
        }

        System.out.println("Minimum salary : "+iMin);
    }

    // Selete Avg(ESalary) from Employee;
    public void AggregateAvg()
    {
        int iSum = 0;

        for(Employee eref : lobj)
        {
            iSum = iSum + eref.ESalary;
        }

        System.out.println("Minimum salary : "+iSum/lobj.size());
    }

    // Selete Count(ESalary) from Employee;
    public void AggregateCount()
    {
        System.out.println("Number of Employees : "+lobj.size());
    }
}

class program626
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

        mobj.SelectStar();

        mobj.SelectSpecific(4);

        mobj.SelectSpecific("Chinmayee Patil");

        mobj.DeleteFrom(4);
        
        mobj.SelectStar();

        mobj.DeleteFrom(7);

        mobj.DeleteFrom("Gaurav Sharma");
        mobj.SelectStar();

        mobj.AggregateSum();

        mobj.AggregateCount();
        mobj.AggregateMax();
        mobj.AggregateMin();
        mobj.AggregateSum();
    }
}