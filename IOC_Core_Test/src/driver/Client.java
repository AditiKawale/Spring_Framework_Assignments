package driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
    public static void main(String args[])
    {
    	Resource resource=new ClassPathResource("resources/spring.xml");
       BeanFactory factory=new XmlBeanFactory(resource);
       System.out.println("Document Valid!!");
       factory.getBean("t");
       factory.getBean("t");
       factory.getBean("t");
    }
}
