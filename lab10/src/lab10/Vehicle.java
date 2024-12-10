package lab10;

public class Vehicle {
	private String manufacturerName;
	private int numberOfCylinders;
	private String ownerName;
	
	public Vehicle() {
		this.manufacturerName = "unknown";
		this.numberOfCylinders = 1;
		this.ownerName = "unknown";
	}
	public Vehicle(String manufacturerName, int numberOfCylinders, String ownerName) {
		setManufacturerName(manufacturerName);
		setNumberOfCylinders(numberOfCylinders);
		setOwnerName(ownerName);
	}
	public String getManufacturerName() {
        return manufacturerName;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public String getOwnerName() {
        return ownerName;
    }
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = (manufacturerName != null && !manufacturerName.isEmpty()) ? manufacturerName : "unknown";
    }
    public void setNumberOfCylinders(int numberOfCylinders) {
        if (numberOfCylinders > 0) {
            this.numberOfCylinders = numberOfCylinders;
        } else {
            throw new IllegalArgumentException("number of cylinders must be greater than 0");
        }
    }
    
    public void setOwnerName(String ownerName) {
        this.ownerName = (ownerName != null && !ownerName.isEmpty()) ? ownerName : "Unknown";
    }
    
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehicle vehicle = (Vehicle) obj;
        return numberOfCylinders == vehicle.numberOfCylinders &&
                manufacturerName.equals(vehicle.manufacturerName) &&
                ownerName.equals(vehicle.ownerName);
    }
    public String toString() {
        return "Manufacturer's Name: " + manufacturerName + "\n" +
               "Number Of Cylinders: " + numberOfCylinders + "\n" +
               "Owner's Name: " + ownerName;
    }
    

}
