import java.util.*;
public class InningsMain {
public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter Team name");
	String str1=sc.next();
	System.out.println("Enter Innings name");
	String str2=sc.next();
	System.out.println("Enter runs");
	int run=sc.nextInt();
	
	
	Innings i=new Innings();
	i.setTeamame(str1);
	i.setInningsname(str2);
	i.setRuns(run);
	
	
	i.displayInningsDetails();
}

}
