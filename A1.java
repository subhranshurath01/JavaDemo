//write a java program to , take a digit , check the no is prime no or not?
import java.util.Scanner;
class A1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number : ");
		int a= sc.nextInt();
			int b= a/2;
            
		if (a%2==1 & a%1==0)
		{
			System.out.println("It is a prime Number");
		}
		else 
		{
			System.out.println("It is not a  prime Number");
		}
	}
}






