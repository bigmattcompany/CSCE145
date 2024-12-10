package homework7;
//matthew gates
public class cruiseship extends ship {
	private int passengercap;
	private int crewmem;
	
	public cruiseship() {
		super();
		this.passengercap = 0;
		this.crewmem = 0;
	}
	public int getpassengercap() {
		return passengercap;
	}
	public void setpassengercap(int passengercap) {
		this.passengercap = passengercap;
	}
	public void setcrewmem(int crewmem) {
		this.crewmem = crewmem;
	}
	
	public String tostring() {
		return "cruise ship name " + getname() + ", passenger capacity: " + passengercap + ", crew members: " + crewmem;
	}

}
