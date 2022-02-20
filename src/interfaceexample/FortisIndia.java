package interfaceexample;

public class FortisIndia implements IHC,Fortis {

	public static void main(String[] args) {
		FortisIndia obj=new FortisIndia();
		obj.surgery();
		obj.emergency();
		obj.cardiology();
		obj.trainingdepartment();
	}

	@Override
	public void surgery() {
		System.out.println("Surgery facility of fortis ");
		
	}

	@Override
	public void emergency() {
		System.out.println("emergency facility of fortis ");
		
	}

	@Override
	public void cardiology() {
		System.out.println("cardiology facility of fortis ");
		
	}

	@Override
	public void trainingdepartment() {
		
		System.out.println("training facility of fortis ");
	}

}
