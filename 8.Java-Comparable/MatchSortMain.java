import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class MatchSortMain {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Match3> ls=new ArrayList<Match3>();
		System.out.println("Enter the number of matches ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter  match date in (MM-dd-yyyy");
		String d1=sc.next();
		Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(d1);
		System.out.println("Enter Team 1 ");
		String n1=sc.next();
		System.out.println("Enter Team 2 ");
		String n2=sc.next();
		ls.add(new Match3(date1,n1,n2));
		}
		Collections.sort(ls);
		for(Match3 ele:ls)
		{
			System.out.println(ele);
		}
	}

}
