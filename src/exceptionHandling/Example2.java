package exceptionHandling;

public class Example2 {

	public static void main(String[] args) {
		
		try {
		int a=10/0;
        System.out.println(a);
		
		}
		catch(ArithmeticException e)
		{
		System.out.println("exception handled / by zero");
		e.printStackTrace();
		}
		catch(Exception e)
		{
		System.out.println("exception handled / by zero");
		e.printStackTrace();
		}
		finally
		{
			System.out.println("finally statements");	
		}
		System.out.println("Rest of the statements");

	}

}


/*try catch
try catch finally
try finally*/



