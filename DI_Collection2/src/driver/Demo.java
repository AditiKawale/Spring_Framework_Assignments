package driver;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import beans.Test;

public class Demo {
public static void main(String[] args) {
	ApplicationContext ap=new ClassPathXmlApplicationContext("resources/spring.xml");
    Test tobj=(Test)ap.getBean("te");
    tobj.show();

}
}
