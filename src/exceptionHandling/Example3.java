package exceptionHandling;

public class Example3 {

	public static void main(String[] args) {
		
		
	int age=10;
	if(age<18)
	{
		try {
			throw new InvalidAgeException("age is less than 18");
		
		} catch (InvalidAgeException e) {
		
		}
	}

	}

}
