import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		digitFactorial(n);
		
	}
static	void digitFactorial(int n)
	{
	    if(n>32767)
	    {
	        System.out.println("Number too large");
	  
	    }
	    else if(n<0)
	    {
	        System.out.println("number too short");
	    }
	    else
	    {
	     int t=n;
	     int rev=0;
	    
	        while(t != 0) 
	        {
            int digit = t% 10;
            rev= rev * 10 + digit;
            t /= 10;
            }
            System.out.println(rev);
         while(rev!=0)
         {
             int k=rev%10;
             for(int i=k-1;i>0;i--)
             {
                k=k*i;
                 
             }
             System.out.println(k);
             rev=rev/10;
             
         }

	     
	    }
	}
}