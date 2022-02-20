package pack;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		ExcelRead ob= new ExcelRead();
		String a=ob.readData(0,0);
        System.out.println("Value of a is "+a);


	}

}
