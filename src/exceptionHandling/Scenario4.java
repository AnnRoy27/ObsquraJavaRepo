package exceptionHandling;

public class Scenario4 {

	public static void main(String[] args) {
		int age=20;
		try {
			if(age<18)
			{
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}


	}

}
