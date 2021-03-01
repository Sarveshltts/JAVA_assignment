import java.util.*;

public class TopScorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> team=new ArrayList<String>();
		ArrayList<String> team2=new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 13");
		for(int i=0;i<5;i++)
		{
			String teams=sc.next();
			team.add(teams);
		}
		System.out.println("Enter the top 5 scorers of IPL Season 12");
		for(int i=0;i<5;i++)
		{
			String teams=sc.next();
			team2.add(teams);
		}
		team.retainAll(team2);
		System.out.println("Consistent Run Scorer:");
		for(String ls:team)
		{
			System.out.println(ls);
		}
	}

}
