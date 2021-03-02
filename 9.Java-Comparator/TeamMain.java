import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TeamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Team> ls=new ArrayList<Team>();
		System.out.println("Enter number of teams:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter team "+(i+1)+" detail");
			System.out.println("Enter Name");
			String name=sc.next();
			System.out.println("Enter number of matches");
			int match=sc.nextInt();
			ls.add(new Team(name,match));
		}
		Collections.sort(ls,new TeamComparator());
		System.out.println("Team list after sort by number of matches");
		for(Team e:ls)
		{
			
			System.out.println(e);
		}
	}

}
