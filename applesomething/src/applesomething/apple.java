package applesomething;

//matthew gates
public class apple {
	private String type;
	private double weight;
	private double price;
	
	public apple() {
		this.type = "gala";
		this.weight = 0.5;
		this.price = 0.88;
	}
	public apple(String xtype, double xweight, double xprice) {
		settype(xtype);
		setweight(xweight);
		setprice(xprice);
	}
	public String gettype() {
		return type;
	}
	public double getweight() {
		return weight;
	}
	public double getprice() {
		return price;
	}
	
	public void settype(String type) {
		if (type.equals("red delicious") || type.equals("golden delicious") || type.equals("gala") || type.equals("granny smith")) {
			this.type = type;
		} else { 
			System.out.println("invalid value");
			this.type = null;
		}
	}
	public void setweight(double weight) {
		if (weight >= 0 && weight <= 2) {
			this.weight = weight; 
		} else {
			System.out.println("invalid value");
			this.weight = 0.0;
		}
	}
	public void setprice(double price) {
		if (price >= 0) {
			this.price = price;
		} else { 
			System.out.println("invalid value");
			this.price = 0.0;
		}
	}

}
