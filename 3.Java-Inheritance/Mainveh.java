import java.util.*;
public class Mainveh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Four Wheeler");
		System.out.println("2. Two Wheeler");
		System.out.println("Enter Vehicle Type:");
		int n=sc.nextInt();
		System.out.println("Enter Vehicle Make:");
		String make=sc.next();
		System.out.println("Enter Vehicle Number:");
		String vehicleNumber=sc.next();
		System.out.println("Enter fuel Type: \n1.Petrol\n2.Diesel ");
		String t=sc.next();
		System.out.println("Enter Fuel Capacity:");
		int fuelCapacity=sc.nextInt();
		System.out.println("Enter Engine CC:");
		int cc=sc.nextInt();
		if(n==1)
		{
			System.out.println("Audio System: ");
			String audioSystem=sc.next();
			System.out.println("number of Doors: ");
			String numberOfDoors=sc.next();
			FourWheeler fw=new FourWheeler(make,vehicleNumber,t,fuelCapacity,cc);
			fw.setAudioSystem(audioSystem);
			fw.setNumberOfDoors(numberOfDoors);
			fw.displayDetailInfo();
		}
		else if(n==2)
		{
			System.out.println("Kick start Available: ");
			boolean kickStartAvailable=sc.nextBoolean();
			TwoWheeler tw=new TwoWheeler(make,vehicleNumber,t,fuelCapacity,cc);
			tw.setKickStartAvailable(kickStartAvailable);
			tw.displayDetailsInfo();
		}
	}

}
