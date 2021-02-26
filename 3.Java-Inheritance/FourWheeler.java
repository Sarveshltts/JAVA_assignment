
public class FourWheeler extends Vehicle
{
	private String audioSystem;
	private String numberOfDoors;
	
	
	
	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
	}
	
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public String getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(String numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	public void displayDetailInfo()
	{
		System.out.println("---Detail Information---");
		System.out.println("Audio System: "+audioSystem);
		System.out.println("Number of Doors: "+numberOfDoors);
	}

}
