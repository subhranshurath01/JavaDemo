//w.a.j program to check factorial of a number ?
import java.util.Scanner;
class A2 
{
	public static void fact(int a)
	{
		int b=1;
      for (int i=a;i>0 ;i-- )
      {
          b=b*i;
      }
	  System.out.println("The factorial of number is "+b);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any Number :");
		int a=sc.nextInt();
          fact(a);

	}
}
