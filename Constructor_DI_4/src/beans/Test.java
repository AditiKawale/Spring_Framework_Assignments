package beans;

public class Test {
     private String name;
 	 private int age;
 	 private String email;
 	 
     public Test(String name, int age,String email) {
		
		this.name = name;
		this.age = age;
		this.email=email;
	}



     
     
     public void fun()
     {
    	 System.out.println("Hello "+" "+name);
    	 System.out.println("Your age is "+" "+age);
    	 System.out.println("Email is "+email);
     }
}
