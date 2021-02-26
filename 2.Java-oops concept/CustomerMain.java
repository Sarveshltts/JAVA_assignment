import java.util.*;
public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter your details:");
		String det=inp.nextLine();
		String[] det2=det.split(",",3);
		String name=det2[0];
		String add=det2[1];
		String mob=det2[2];
		Customer c1=new Customer();
		c1.setname(name);
		c1.setaddress(add);
		c1.setmobile(mob);
		System.out.println("Name: "+c1.getname());
		System.out.println("Address: "+c1.getaddress());
		System.out.println("Mobile number: "+c1.getmobile());
	}

}
