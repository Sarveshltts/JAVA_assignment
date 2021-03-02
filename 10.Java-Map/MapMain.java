import java.util.HashMap;
import java.util.Scanner;

public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<String, String> hs=new HashMap<String,String>();
		String a=sc.next();
		String b=sc.next();
		Bowler bo=new Bowler(b);
		Wicket w=new Wicket(a, bo);
		String c=w.getPlayerName();
		String[] cw=c.split("|");
		System.out.println(cw);

	}

}
 