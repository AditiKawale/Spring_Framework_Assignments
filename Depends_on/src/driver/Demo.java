package driver;

import org.springframework.context.ApplicationContext;


import org.springframework.context.support.ClassPathXmlApplicationContext;





public class Demo {

	public static void main(String args[]) {
		
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
	
	}
}
