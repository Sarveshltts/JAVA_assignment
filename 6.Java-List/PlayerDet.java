import java.util.*;

public class PlayerDet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> team=new ArrayList<String>();
		System.out.println("Enter player details ");
		System.out.println("Enter player name: ");
		String name=sc.next();
		team.add(name);
		System.out.println("Enter age: ");
		String age=sc.next();
		team.add(age);
		System.out.println("Enter country: ");
		String count=sc.next();
		team.add(count);
		System.out.println("Player details:");
		for(String ls : team)
		{
			System.out.println(ls);
		}
		System.out.println("Enter Skill: ");
		String ski=sc.next();
		System.out.println("Enter the position to add the skill: ");
		int n=sc.nextInt();
		team.set(n, ski);
		System.out.println("Player details:");
		for(String ls : team)
		{
			System.out.println(ls);
		}
		System.out.println("Enter the position of the detail to be removed: ");
		int n2=sc.nextInt();
		team.remove(n2);
		System.out.println("Player details:");
		for(String ls : team)
		{
			System.out.println(ls);
		}
	}

}
