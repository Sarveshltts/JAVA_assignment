import java.util.Scanner;

public class ArrayExcep {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of overs:");
		int num=sc.nextInt();
		int[] arr=new int[num];
		System.out.println("Enter the runs scored each over:");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the over number: ");
		int n=sc.nextInt();
		int ele=arr[n];
		System.out.println("Run scored in this over: "+ele);
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
