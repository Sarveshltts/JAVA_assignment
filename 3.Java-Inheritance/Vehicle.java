
public class Vehicle 
{
	private String make;
	private String vehicleNumber;
	private String fuelType;
	private int fuelCapacity;
	private int cc;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	void displaymake()
	{
		System.out.println("**"+make+"**");
		System.out.println("---Basic Information---");
		System.out.println("Vehicle Number: "+vehicleNumber);
		System.out.println("Fuel Capacity: "+fuelCapacity);
		if(fuelType=="1")
		{
			System.out.println("Fuel Type: Petrol");
		}
		else if(fuelType=="2")
		{
			System.out.println("Fuel Type: Diesel");
		}
		System.out.println("CC: "+cc);
	}
	public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		super();
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
		displaymake();
	}
}
