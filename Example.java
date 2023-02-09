class Sample304
{
	public static void main(String[] args) 
	{
		Sample.area(1.4);
		
	}
}
class Sample
{

	public static double area(int r)
	{
		final double pi=3.14;
		double result=pi*r*r;
		System.out.println(result);
		return result;
	}
}
