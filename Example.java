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
	 System.out.println(result);
	}
}
