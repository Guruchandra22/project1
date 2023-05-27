package car;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Testbike {
public static void main(String[] args) {
ClassPathResource resource=new ClassPathResource("ioc2.2.xml");
BeanFactory beanFactory=new XmlBeanFactory(resource);
Bike b=(Bike) beanFactory.getBean("mybike");
b.bikemodel();

//	Car c=(Car) beanfactory.getBean("mycar");
//	c.drive();
	
//	ApplicationContext context=new ClassPathXmlApplicationContext("ioc2.2.xml");
//	Bike b=(Bike) context.getBean("mybike");
//	b.bikemodel();
}
}
