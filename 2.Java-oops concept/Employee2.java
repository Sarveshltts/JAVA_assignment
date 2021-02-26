import java.util.*;
public class Employee2 
{
    private String name;
	private String address;
	private String mobile;
	
	public String getname()
	{
		return name;
	}
	public String getaddress()
	{
		return address;
	}
	public String getmobile()
	{
		return mobile;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setaddress(String add)
	{
		address=add;
	}
	public void setmobile(String mob)
	{
		mobile=mob;
	}
    public void display()
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Employee Details");
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Mobile Number: "+mobile);
        System.out.println("Verify and Update the Details:");
        System.out.println("Menu");
        System.out.println("1. Update Employee name \n2. Update Employee Address\n3. Update Employee mobile\n4. All information correct/Exit");
        int n=inp.nextInt();
        if(n==1)
        {
            System.out.println("Current name is: "+name);
            System.out.println("Enter the new Name:");
            String name1=inp.next();
            name=name1;
            display();
        }
        else if(n==2)
        {
            System.out.println("Current address is: "+address);
            System.out.println("Enter the new Address");
            String add=inp.next();
            setaddress(add);
            display();
        }
        else if(n==3)
        {
            System.out.println("Current name is: "+mobile);
            System.out.println("Enter the new mobile");
            String mob=inp.next();
            setmobile(mob);
            display();
        }
        else if(n==4)
        {
            System.exit(0);
        }
        }

    }

