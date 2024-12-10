package homework5;
//Matthew Gates
public class coffee {
	private String coffee;
	private int caffine;
	public coffee()
	{
		this.coffee = "none";
		this.caffine = 50;
	}
	public String getCoffee()
	{
		return coffee;
	}
	public int getCaffine()
	{
		return caffine;
	}
	public void setCoffee(String xcoffee)
	{
		if (xcoffee != null)
		{
			this.coffee = xcoffee;
		}
	}
	public void setcaffine(int xcaffine)
	{
		if (xcaffine >= 50 && xcaffine <= 300)
		{
			this.caffine = xcaffine;
		}
	}
	public double risky()
	{
		return 180.0 / ((caffine/100.0) * 6.0);
	}
	public boolean equals(coffee coffee2)
	{
		return this.coffee.equals(coffee2.coffee) && this.caffine == coffee2.caffine;
	}
	public String tostring()
	{
		return "Name: " + coffee + "caffine amount: " + caffine;
	}

}
