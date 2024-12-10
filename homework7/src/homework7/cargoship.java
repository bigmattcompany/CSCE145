package homework7;
//matthew gates
public class cargoship extends ship {
	private double tonnage;
	private double maxspeed;
	
	public cargoship() {
		super();
		this.tonnage = 0.0;
		this.maxspeed = 0.0;
	}
	
	public double gettonnage() {
		return tonnage;
	}
	public double getmaxspeed() {
		return maxspeed;
	}
	
	public void settonnage(double tonnage) {
		this.tonnage = tonnage;
	}
	public void setmaxspeed(double maxspeed) {
		this.maxspeed = maxspeed;
	}
	
	public String tostring() {
		return "cargo ship name: " + getname() + ". tonnage: " + tonnage + " DWT, max speed: " + maxspeed + " knots";
	}

}
