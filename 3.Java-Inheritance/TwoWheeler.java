
public class TwoWheeler extends Vehicle
{
	private boolean  kickStartAvailable;
	
	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
	}


	


	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}


	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}


	public void displayDetailsInfo()
	{
		System.out.println("---Detail Information---");
		System.out.println("Kick Start Available: " +kickStartAvailable);
	}
}
