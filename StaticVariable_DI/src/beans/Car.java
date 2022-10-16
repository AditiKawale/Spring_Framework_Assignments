package beans;

public class Car {

	private static String carname;

	public static void setCarname(String carname) {
		Car.carname = carname;
	}
	
	public static void show()
	{
		System.out.println("Carname: "+carname);
	}
}
