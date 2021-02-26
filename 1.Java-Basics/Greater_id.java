import java.util.*;
public class Greater_id 
{
	private static void findCricketerId(int arr[], int num, int check)
	{
		 ArrayList<Integer> arr1=new ArrayList<Integer>();
		for(int j=0;j<num;j++)
	     {
	        if(j%2==1)
	        {
	            if(arr[j]>check)
	            {
	                arr1.add(arr[j-1]);
	            }
	        }
	     }
	     System.out.println(arr1);
	}
 public static void main(String[] args) 
 {
     Scanner inp=new Scanner(System.in);
     int num=inp.nextInt();
     if(num<0)
     {
         System.out.print("Invalid array size");
         System.exit(0);
     }
     int[] arr= new int[num];
     for(int i=0;i<num;i++)
     {
         arr[i]=inp.nextInt();
         if(arr[i]<0)
     {
         System.out.print("Invalid input");
         System.exit(0);
     }
     }
     int check=inp.nextInt();
     if(check<0)
     {
         System.out.print("Invalid score");
         System.exit(0);
     }
     findCricketerId(arr,num,check);
 }   
}