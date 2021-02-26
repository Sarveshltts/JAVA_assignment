import java.util.*;
public class Caps_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		String f=inp.nextLine();
		String s=inp.nextLine();
		String cap = f.substring(0, 1).toUpperCase() + f.substring(1).toLowerCase();
		String caps= s.toUpperCase();
		System.out.println(cap+" "+caps);
	}

}
