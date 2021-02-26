import java.util.*;
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name=inp.nextLine();
		System.out.println("Enter the address : ");
		String add=inp.nextLine();
		System.out.println("Enter the mobile number : ");
		String mob=inp.nextLine();
		Employee_Main e1= new Employee_Main();
		e1.setname(name);
		e1.setaddress(add);
		e1.setmobile(mob);
		System.out.println("Employee Details");
		System.out.println("Name: "+ e1.getname());
		System.out.println("Address: "+ e1.getaddress());
		System.out.println("Mobile: "+ e1.getmobile());
	}

}
