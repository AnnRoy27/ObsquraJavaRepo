import java.util.Scanner;
class ReadInpuArray
{


public static void main(String args[])
{

int a[]=new int[5];

Scanner s=new Scanner(System.in);

System.out.println("Enter the numbers"); 

for(int i =0;i<a.length;i++)
{
 a[i]=s.nextInt();

}


System.out.println("Numbers are "); 
for(int i =0;i<a.length;i++)
{

System.out.println(a[i]); 
}


}
}




