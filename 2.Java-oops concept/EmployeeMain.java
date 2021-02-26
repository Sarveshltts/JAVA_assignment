import java.util.*;
public class EmployeeMain 
{
    
    
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name=inp.nextLine();
        System.out.println("Enter the address: ");
        String add=inp.nextLine();
        System.out.println("Enter the mobile no.: ");
        String mob=inp.nextLine();
        Employee2 e=new Employee2();
        e.setname(name);
        e.setaddress(add);
        e.setmobile(mob);
        e.display();

    }
    
}
