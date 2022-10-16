package beans;

public class Test {
     private String name;
 	 private int age;
     public Test(String nam) {
		this.name = nam;
	}

     public Test(int age) {
 		this.age = age;
 	}


     
     
     public void fun()
     {
    	 System.out.println("Hello "+" "+name);
    	 System.out.println("Your age is "+" "+age);
    	 // System.out.println("Hello "+gender+" "+name);
     }
}
