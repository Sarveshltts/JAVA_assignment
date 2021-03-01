import java.util.*;

public class Top5 {
	public static void main(String[] args)
	{
		ArrayList<String> teamn=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		for(int  i=0;i<5;i++)
		{
			String name=sc.next();
			teamn.add(name);
		}
		System.out.println("Enter swap positons: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		Collections.swap(teamn, n1, n2);
		for(String ls: teamn)
		{
			System.out.println(ls);
		}
	}
}
