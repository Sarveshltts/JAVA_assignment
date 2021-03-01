import java.util.Scanner;

public class AgeExcep 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the player name: ");
		String name=sc.next();	
		System.out.println("Enter the player age: ");
		int age=sc.nextInt();
		if(age<19)
		{
			throw new InvalidAgeException("InvalidAgeRangeException");
		}
		else {
		System.out.println("Player name : "+name+"\n Player age : "+age);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
