package spring.binu;

public class Cat implements Animal{

	String food;
	
	@Override
	public String animalType() {
		return "This is the Cat , who eats "+food;
	}

}
