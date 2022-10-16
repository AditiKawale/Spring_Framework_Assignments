package beans;
import java.util.*;


public class Test {

	private Vector fruits;
	private TreeSet cricketers;
	private Hashtable StCap;
	
	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}


	public void setCricketers(TreeSet cricketers) {
		this.cricketers = cricketers;
	}


	public void setStCap(Hashtable stCap) {
		this.StCap = stCap;
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
