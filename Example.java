class AreaCircle
{
	public static void main(String[] args) 
	{
		Sample.area(5);	
		
	}
}
class Sample
{
 static double area(int r)
	{
	 final double pi=3.14;
	 double result=pi*r*r;
	 System.out.println("Area of Circle is :" + result);
	}
}
class EvenOdd
{
	static void num(int num1,int num2)
	{
		for (int i = num1;i<=num2 ;i++ )
		{
			if (i%2==0)
			{
				System.out.println( "Even numbers are : "+i);
			}else
				{
				System.out.println("Odd numbers are : "+i);
				}
		}
	}
}
