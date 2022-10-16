package driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;



public class Demo {

	public static void main(String args[]) {
		
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/car_engine.xml" );
	Car cobj=(Car)ap.getBean("c");
	cobj.Show();
	}
}
