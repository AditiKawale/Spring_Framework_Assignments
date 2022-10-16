//how to inject primitive array into bean class

package beans;

public class Test {

	private String name[];

	public void setName(String[] name) {
		this.name = name;
	}
	
	public void show()
	{
		for(String n:name) {	
		System.out.println("Name is: "+n);
	  }
	}
}
