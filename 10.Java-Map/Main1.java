

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main1 {
	public static void main(String args[])
	{
		String ch="";
		String cho="";
		Scanner sc=new Scanner(System.in);
		Map<String,ArrayList> m=new HashMap<String,ArrayList>();
		Wicket w=new Wicket();
	    Bowler b=new Bowler();
		do
		{
			
			System.out.println("Enter the player name ");
			String pname=sc.nextLine();
			System.out.println("Enter wickets - seperated by -> | symbol");
			String wkts=sc.nextLine();
			String[] arr=wkts.split("\\|");
			ArrayList<String> al=new ArrayList<String>();
			for(String S:arr)
			{
				al.add(S);
			}
			for(String s:arr)
			{
				System.out.println(s);
			}
			
			m.put(pname, al);
			System.out.println("Do you want to add another"
					+ " player (yes/no) ");
			 ch=sc.nextLine();
		}
		while(ch.equalsIgnoreCase("yes"));
		do
		{
			if(ch.equals("no"))
			{
				System.out.println("Enter the player name to search ");
				String searchp=sc.nextLine();
				/*if(!searchp.equals(m.get(searchp)))
			    {
			    	System.out.println("No player found with the name ");
			    	
			    }
				else
				{
					System.out.println("Player Name :"+b.getName());
			    	System.out.println("Wickets :");
			    	for(Map.Entry m1 :m.entrySet())
			    	{
			    		System.out.println(m1.getKey());
			    	}
				}*/
				boolean isKeyPresent = m.containsKey(searchp);
				if(isKeyPresent!=true)
				{
					System.out.println("No player found with the name ");
				}
				else
				{
					System.out.println("Player Name :"+searchp);
			    	System.out.println("Wickets :");
			    	System.out.println(m.get(searchp));
				}
				
				    	
				    	 
			           
			   
				System.out.println("Do you want to search another player (yes/no) ");
				 cho=sc.nextLine();
				//------------------------------
			
			}
		}
		while(cho.equalsIgnoreCase("yes"));
	}
}


	


