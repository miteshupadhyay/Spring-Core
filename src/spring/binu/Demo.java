package spring.binu;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Demo {

	public static void main(String[] args) {
		
		
		FileSystemResource resource=new FileSystemResource("DemoConfig.xml");
		
		XmlBeanFactory factory=new XmlBeanFactory(resource);
		
		Object object=factory.getBean("spring.binu.Dog#1");
		Animal animal=(Animal)object;
		
		System.out.println(animal.animalType());
		
		
	}
	
}
