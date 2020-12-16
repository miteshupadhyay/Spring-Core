package spring.binu;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Test {

	public static void main(String[] args) {
		
		//Locate Spring Configuration File from FileSystemResource
		FileSystemResource resource=new FileSystemResource("DemoConfig.xml");
		
		//Active the Spring Container
		XmlBeanFactory factory=new XmlBeanFactory(resource);
		
		//get Spring Bean class object from Spring Container
		Object object=factory.getBean("myDog");
		
		Animal animal=(Animal)object;
		
		System.out.println(animal.animalType());
		
		
		
		//Animal animal=new Cat();

			//System.out.println(animal.animalType());
		
	}
	
}
