package beans;

public class Car {

	private String[] carnames;
	private Engine[] engine;
	
	public void setCarnames(String[] carnames) {
		this.carnames = carnames;
	}
	
	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}
	
	public void show() {
		for(String car:carnames)
		{
			System.out.println(car);
		}
		for(Engine e:engine)
		{
			System.out.println(e.getModelyear());
		}
	}
	
}
