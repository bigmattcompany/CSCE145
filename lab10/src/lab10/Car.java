package lab10;

public class Car extends Vehicle {
	private double gasMileage; 
    private int numberOfPassengers;

    
    public Car() {
        super(); 
        this.gasMileage = 0.0;
        this.numberOfPassengers = 0;
    }

    
    public Car(String manufacturerName, int numberOfCylinders, String ownerName, double gasMileage, int numberOfPassengers) {
        super(manufacturerName, numberOfCylinders, ownerName); 
        setGasMileage(gasMileage);
        setNumberOfPassengers(numberOfPassengers);
    }

    
    public double getGasMileage() {
        return gasMileage;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    
    public void setGasMileage(double gasMileage) {
        if (gasMileage >= 0) {
            this.gasMileage = gasMileage;
        } else {
            throw new IllegalArgumentException("Gas mileage cant be negative");
        }
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        if (numberOfPassengers >= 0) {
            this.numberOfPassengers = numberOfPassengers;
        } else {
            throw new IllegalArgumentException("number of passengers cant be negative");
        }
    }

    
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Car car = (Car) obj;
        return Double.compare(car.gasMileage, gasMileage) == 0 &&
               numberOfPassengers == car.numberOfPassengers;
    }

    
    @Override
    public String toString() {
        return super.toString() + "\n" +
               "gas mileage: " + gasMileage + " gallons\n" +
               "number of passengers: " + numberOfPassengers;
    }

}
