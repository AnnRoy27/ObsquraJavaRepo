package polymorphism;

public class Test {

	public static void main(String[] args) {
	Bank obj3=new Bank();
	obj3.getInterest();
	HDFCBank obj=new HDFCBank();
	obj.getInterest();
	SBIBank obj1=new SBIBank();
    obj1.getInterest();
	}

}
