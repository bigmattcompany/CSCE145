package homework7;
//matthew gates
public class ship {
	private String name;
	private String launchdate; //mm/dd/yyyy
	
	public ship() {
		this.name = " ";
		this.launchdate = " ";
	}
	public String getname() {
		return name;
	}
	public String getlaunchdate() {
		return launchdate;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setlaunchdate(String launchdate) {
		String yearstring = launchdate.split("/")[2];
		int year = Integer.parseInt(yearstring);
		if (year >= 1990 && year <= 2019) {
			this.launchdate = launchdate;
		} else {
			System.out.println("invalid launch date. must be between 1990 and 2019");
		}
	}
	
	public String tostring() {
		return "ship name: " + name + ", launch date: " + launchdate;
	}

}
