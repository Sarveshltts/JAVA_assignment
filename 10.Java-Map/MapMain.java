import java.util.HashMap;
import java.util.Scanner;

public class MapMain {
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tf=null;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the player name ");
		String b=sc.next();
		System.out.println("Enter wickets - seperated by \"|\" symbol");
		String a=sc.next();
		Bowler bo=new Bowler(b);
		Wicket w=new Wicket(a, bo);
		String c=w.getPlayerName();
		String[] cw=c.split("|",1);
		System.out.println("Do you want to add another player (yes/no)");
		tf=sc.next();
		HashMap<String, String[]> hs=new HashMap<String,String[]>();
		hs.put(b, cw);
		
		}
		while(tf.equalsIgnoreCase("yes"));
		
		
		
	}

}
 