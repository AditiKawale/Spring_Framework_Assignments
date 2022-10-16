package beans;
import java.util.*;


public class Test {

	private List fruits;
	private Set cricketers;
	private Map StCap;
	
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}
	public void setStCap(Map stCap) {
		StCap = stCap;
	}
	
	public void show()
	{
		System.out.println("Fruits: ");
		for(Object f:fruits)
		{
			System.out.println(f);
		}
		
		for(Object c:cricketers)
		{
			System.out.println(c);
		}
		
		System.out.println("State Capitals: ");
		Set keys=StCap.keySet();
		for(Object s:keys)
		{
			System.out.println("State= "+s+"  Capital= "+StCap.get(s));
		}
	}
	
}
