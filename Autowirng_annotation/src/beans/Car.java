package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	
	@Autowired
	@Qualifier(value="e1")
	private Engine engine;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void show()
	{
	
		System.out.println("Engine Model Year: "+engine.getModelyear());
	}
}
