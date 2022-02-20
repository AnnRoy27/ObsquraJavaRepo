package exceptionHandling;
/**
 * 
 * default throw and our catch
 *
 */
public class Scenario2 {

	public static void main(String[] args) {
		try {
		int a=10/0;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Rest of the statements");

	}


	}


