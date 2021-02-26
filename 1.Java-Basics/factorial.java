import java.util.ArrayList;
import java.util.*;


public class factorial {
	public static int factor(int n) 
	{ 
	    if (n == 0) 
	      return 1; 
	      
	    return n*factor(n-1); 
	} 
	public static void digit_Factorial(int number)
	{
		long fact=1;
		int num=0;
		int length = String.valueOf(number).length();
		ArrayList<Long> fa= new ArrayList<Long>();
		for(int i=0;i<length;i++)
		{
			num=number%10;
			number=number/10;
			fact=factor(num);
			fa.add(fact);
		}
		ArrayList<Long> revArrayList = new ArrayList<Long>(); 
        for (int i = fa.size() - 1; i >= 0; i--) { 
  
            // Append the elements in reverse order 
            revArrayList.add(fa.get(i)); 
        } 
   
		System.out.print(revArrayList);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		int number=inp.nextInt();
		digit_Factorial(number);
	}

}
