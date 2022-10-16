package beans;

public class Test {
     private String name;
 	 private int age;
     public Test(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



     
     
     public void fun()
     {
    	 System.out.println("Hello "+" "+name);
    	 System.out.println("Your age is "+" "+age);
    	 // System.out.println("Hello "+gender+" "+name);
     }
}
