class A
{
	public static void main (String [] args)
	{
		int [] a={5,4,7,8,1};
		int b=a.length;
		int sum=0;

		for (int i=0;i< b ;i++ )
		{
			
			sum=sum+a[i];
			

			if (a[i]%2==0)
			{
				System.out.println("The even number are :"+a[i]);

			}
			System.out.println("The sum of Numbers is "+sum);
			
		}

		
	}
}