package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
	ArrayList<String> l=new ArrayList<>(); //generic 
	//List<String> l=new ArrayList<>();
	
	// no generic ArrayList l=new ArrayList<>();
	l.add("abhimanyu");//0
	l.add("Athira");//1
	l.add("santhi");//2
	//l.remove(2);
	int s=l.size();
	String v=l.get(0);
	boolean f=l.contains("ann");
	//System.out.println(l);

/*	
	for(int i=0;i<s;i++)
	{
	System.out.println(l.get(i));
	}*/
	
Iterator<String> itr=l.iterator();
	while(itr.hasNext())
	
	{
	String value=itr.next();
	System.out.println(value);
	}

	
	
	
	

	}

}
