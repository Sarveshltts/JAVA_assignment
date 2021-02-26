import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the company name:");
		String name=inp.nextLine();
		System.out.println("Enter the employees name:");
		String emp=inp.nextLine();
		System.out.println("Enter the team leader name:");
		String tl=inp.nextLine();
		String[] arr=emp.split(",",15);
		boolean test=false;
		for(String i:arr)
		{
			if(i.equals(tl))
			{
				test=true;
				break;
			}
		}
		if(test==false)
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
		System.out.println(test);
		Company c2=new Company();
		c2.setname(name);
		c2.setemployees(emp);
		c2.setteamleader(tl);
		System.out.println("Name: "+ c2.getname());
		System.out.println("Employees: "+ c2.getemployees());
		System.out.println("Tean Leader: "+ c2.getteamleader());
	}

}
