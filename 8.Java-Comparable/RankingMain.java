import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RankingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Ranking> ls=new ArrayList<Ranking>();
		System.out.println("Please provide the number of  players ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name of the player "+(i+1));
			String name=sc.next();
			System.out.println("Enter the score of the player "+(i+1));
			int run=sc.nextInt();
			ls.add(new Ranking((i+1),name,run));
		}
		Collections.sort(ls);
		for(Ranking r:ls)
		{
			System.out.println(r);
		}
	}

}
