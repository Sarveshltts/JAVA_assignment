import java.util.*;
public class Same_sur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		String p1=inp.nextLine();
		String p2=inp.nextLine();
		String[] names1=p1.split(" ",2);
		String[] names2=p2.split(" ",2);
		if(names1[names1.length-1].equals(names2[names2.length-1]))
		{
			System.out.println("Yes");
		}
		else
			
		{
			System.out.println("No");
		}
	}

}
