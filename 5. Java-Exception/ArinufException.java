import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class ArinufException {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		DecimalFormat df=new DecimalFormat("0.00");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.println("Enter the total run scored: ");
		int run=Integer.parseInt(br.readLine());
		System.out.println("Enter the total over faced: ");
		int over=Integer.parseInt(br.readLine());
		float rr;
		rr=(float)(run)/(float)(over);
		System.out.println("Current Run rate: "+df.format(rr));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
