package concertlab;
//matthew gates
public class Concert {
	private String BandName;
	private int capacity;
	private int tixbyphone;
	private int tixbyven;
	private double pricephone;
	private double priceven;
	
	public Concert() {
		this.BandName = "no name yet";
		this.capacity = 0;
		this.tixbyphone = 0;
		this.tixbyven = 0;
		this.pricephone = 0.0;
		this.priceven = 0.0;
	}
	public Concert(String bandName, int capacity, double pricephone, double priceven) {
		this.BandName = bandName;
		this.capacity = capacity;
		this.tixbyphone = 0;
		this.tixbyven = 0;
		this.pricephone = pricephone;
		this.priceven = priceven;
	}
	public Concert(String bandName, int capacity, int tixbyphone, int tixbyven, double pricephone, double priceven) {
		this.BandName = bandName;
		this.capacity = capacity;
		this.tixbyphone = tixbyphone;
		this.tixbyven = tixbyven;
		this.pricephone = pricephone;
		this.priceven = priceven;
	}
	public String getbandName() {
		return BandName;
	}
	public int getcapacity() {
		return capacity;
	}
	public int gettixbyphone() {
		return tixbyphone;
	}
	public int gettixbyven() {
		return tixbyven;
	}
	public double getpricephone() {
		return pricephone;
	}
	public double getpriceven() {
		return priceven;
	}
	
	public void setBandName(String bandName) {
		this.BandName = bandName;
	}
	public void setcapacity(int capacity) {
		if (capacity >= totalNumberOfTicketsSold()) {
			this.capacity = capacity;
		} else {
			System.out.println("new capacity is less than tickets already sold");
		}
	}
	public void setpricephone(double pricephone) {
		if (pricephone >= 0) {
			this.pricephone = pricephone;
		}
	}
	public void setpriceven(double priceven) {
		if (priceven >= 0) {
			this.priceven = priceven;
		}
	}
	
	public int totalNumberOfTicketsSold() {
		return tixbyphone + tixbyven;
	}
	public int ticketsRemaining() {
		return capacity - totalNumberOfTicketsSold();
	}
	public void buyTicketsAtVenue(int numtix) {
		if (ticketsRemaining() >= numtix) {
			tixbyven += numtix;
		} else {
			System.out.println("sold out");
		}
	}
	public void buyTicketsByPhone(int numTickets) {
		if(ticketsRemaining() >= numTickets) {
			tixbyphone += numTickets;
		} else {
			System.out.println("sold out");
		}
	}
	
	public double totalsales() {
		return (tixbyphone * pricephone) + (tixbyven * priceven);
	}

}
