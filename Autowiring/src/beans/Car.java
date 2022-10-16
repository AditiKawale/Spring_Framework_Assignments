package beans;

public class Car {

	private Engine engine;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void show()
	{
		System.out.println("Engine Model Year: "+engine.getModelyear());
	}
}
