package beans;

public class Car {

	private String carname;//primitive datatype
    private Engine engine;//secondary datatype
    
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	public void Show()
	{
		System.out.println("Carname is: "+carname);
		System.out.println("Model Year is: "+engine.getModelyear());
	}
}
