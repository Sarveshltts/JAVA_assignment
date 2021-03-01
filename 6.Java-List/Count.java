import java.util.*;
import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,count2=0;
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{   int n2 = sc.nextInt();
			arr.add(n2);
		}
		
		 for(int i=0;i<n;i++)
		 { if(arr.get(i)>=50 && arr.get(i)<=99) 
			 count++; 
		 if(arr.get(i)>=100 && arr.get(i)<=199) 
			 count2++; 
		 }
		 System.out.println(count);
		 System.out.println(count2);
	
		
		

	}

}