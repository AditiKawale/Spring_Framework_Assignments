package driver;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import beans.Test;


public class Demo {

	public static void main(String[] args) {
		Resource r=new ClassPathResource("resources/spring.xml");//in this file we need to identify location of xml file
		BeanFactory factory=new XmlBeanFactory(r);
		
		Test tobj=(Test)factory.getBean("t");
		Test tobj1=(Test)factory.getBean("t");
		Test tobj2=(Test)factory.getBean("t");
		tobj.fun();
	}
}
