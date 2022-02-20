package exceptionHandling;

import java.io.IOException;

public class Example4 {
	
	public void first() throws IOException
	{
		
		
		second();
	
		
		
	}
	 public void second() throws IOException
	 {
		
		third(); 
		
	
	 }
	public void third() throws IOException
	{

  throw new IOException();


     
	}
	

	public static void main(String[] args) {
		
		Example4 obj=new Example4();
		
	
	
		try {
			obj.first();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
