package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;



public class Demo {

	public static void main(String args[]) {
		/*
		 * String arr[]=new String[] { "resources/car.xml","resources/engine.xml" };
		 * ApplicationContext ap=new ClassPathXmlApplicationContext(arr);
		 */
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/car.xml","resources/engine.xml" );
	Car cobj=(Car)ap.getBean("c");
	cobj.Show();
	}
}
