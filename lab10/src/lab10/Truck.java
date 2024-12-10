package lab10;

public class Truck extends Vehicle {
	private double loadCapacity;
	private double towingCapacity;
	
	 public Truck() {
	        super(); 
	        this.loadCapacity = 0.0;
	        this.towingCapacity = 0.0;
	    }
	 
	 public Truck(String manufacturerName, int numberOfCylinders, String ownerName, double loadCapacity, double towingCapacity) {
	        super(manufacturerName, numberOfCylinders, ownerName); // Call Vehicle's parameterized constructor
	        setLoadCapacity(loadCapacity);
	        setTowingCapacity(towingCapacity);
	    }
	 public double getLoadCapacity() {
	        return loadCapacity;
	    }

	    public double getTowingCapacity() {
	        return towingCapacity;
	    }
	    
	    public void setLoadCapacity(double loadCapacity) {
	        if (loadCapacity >= 0) {
	            this.loadCapacity = loadCapacity;
	        } else {
	            throw new IllegalArgumentException("load capacity cant be negative");
	        }
	    }
	    
	    public void setTowingCapacity(double towingCapacity) {
	        if (towingCapacity >= 0) {
	            this.towingCapacity = towingCapacity;
	        } else {
	            throw new IllegalArgumentException("towing capacity cant be negative");
	        }
	    }
	    public boolean equals(Object obj) {
	        if (!super.equals(obj)) return false;
	        Truck truck = (Truck) obj;
	        return Double.compare(truck.loadCapacity, loadCapacity) == 0 &&
	               Double.compare(truck.towingCapacity, towingCapacity) == 0;
	    }
	    public String toString() {
	        return super.toString() + "\n" +
	               "Load Capacity: " + loadCapacity + "\n" +
	               "Towing Capacity: " + towingCapacity;
	    }

}
