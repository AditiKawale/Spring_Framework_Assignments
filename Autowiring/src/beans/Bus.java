package beans;

public class Bus {
	private Engine engine;
	
	public Bus(Engine engine)
	{
		System.out.println("Parameterized Constructor");
		this.engine=engine;
	}
	
	public void show()
	{
		System.out.println("Bus Engine Model year: "+engine.getModelyear());
	}
}
