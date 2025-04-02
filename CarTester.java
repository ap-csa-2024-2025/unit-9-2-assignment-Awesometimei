public class CarTester
{
	public static void run()
	{
		Car c1 = new Car("Toyota Corolla", 5);
		System.out.println(c1.getModel());
		System.out.println(c1.getFuelLevel());
		System.out.println(c1.milesLeft(23));
		System.out.println(c1);

		ElectricCar e1 = new ElectricCar("Toyota Rav4", 91);
		System.out.println(e1.getModel());
		System.out.println(e1.getFuelLevel());
		System.out.println(e1.milesLeft(400));
		System.out.println(e1);
	}
}
