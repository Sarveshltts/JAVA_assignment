import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class SecondSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TreeSet<String> hs=new TreeSet<String>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String name=sc.next();
			hs.add(name);
		}
		System.out.println("**************************************");
		for(String ls:hs)
		{
			System.out.println(ls);
		}
	}

}
