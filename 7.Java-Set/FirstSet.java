import java.util.*;

public class FirstSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashSet<String> hs=new HashSet<String>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String name=sc.next();
			hs.add(name);
		}
		System.out.println(hs.size());
		
	}

}
