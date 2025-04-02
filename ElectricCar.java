public class ElectricCar extends Car {
	public ElectricCar(String model, int batteryLevel)
	{
		super(model, batteryLevel);
	}

	public double fuelLevel()
	{
		return super.getFuelLevel()/100;
	}

	public double milesLeft(double milesOnFullCharge)
	{
		return milesOnFullCharge*this.fuelLevel();
	}


	// Override toString
	// Should print: model electric car
	public String toString()
	{
		return this.getModel() + " electric car";
	}
}

