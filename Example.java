class Example
{

public static void main(String args[])
{
Example.sum(10d,10l);


}

public static void sum(double a ,long b)
{

System.out.println("static method1 "+ b);

}
public static void sum(float a ,float b)
{

System.out.println("static method2"+a);

}


}